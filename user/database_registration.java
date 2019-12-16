package user;

import java.sql.*;

public class database_registration extends database_user{

    public Integer registration(String login_u, String password_u) throws SQLException, ClassNotFoundException {
        int k = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                if(resultSet.getString("u_login").equals(login_u)){
                    return k;

                }
            }
            int i = statement.executeUpdate("INSERT INTO users (u_login, u_password) values ('" + login_u + "', '" + password_u + "')");


        }

        return k;
    }

    public void create_user(user user, int u_id)throws SQLException, ClassNotFoundException{
        System.out.println("weight "+user.getWeight_u());
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code_inf = "INSERT INTO information (i_name, i_surname, i_number, i_email, i_user_id) values (?, ?, ?, ?, ?)";
            String sql_code_ch = "INSERT INTO  characteristic (ch_age, ch_grow, ch_weight, ch_user_id) values (?, ?, ?, ?)";
            PreparedStatement preparedStatement_inf = connection.prepareStatement(sql_code_inf);
            PreparedStatement preparedStatement_ch = connection.prepareStatement(sql_code_ch);
            preparedStatement_inf.setString(1, user.getName_u());
            preparedStatement_inf.setString(2, user.getSurname_u());
            preparedStatement_inf.setInt(3, user.getNumber_u());
            preparedStatement_inf.setString(4, user.getEmail());
            preparedStatement_inf.setInt(5, u_id);
            preparedStatement_ch.setString(1, user.getAge_u());
            preparedStatement_ch.setInt(2, user.getGrow_u());
            preparedStatement_ch.setInt(3, user.getWeight_u());
            preparedStatement_ch.setInt(4, u_id);
            preparedStatement_inf.execute();
            preparedStatement_ch.execute();
        }
    }

    public user get_user(int user_id)throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select i_name, i_surname, i_number, i_email, ch_age, ch_grow, ch_weight from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id  where i_user_id = '" + user_id + "'";
            ResultSet resSet = statement.executeQuery(sql_code);
            while (resSet.next()) {
                return new user(user_id, resSet.getString("i_surname"), resSet.getString("i_name"), resSet.getInt("i_number"), resSet.getString("i_email"), resSet.getInt("ch_grow"), 0, 0, 0, resSet.getInt("ch_weight"), String.valueOf(resSet.getDate("ch_age")));

            }

        }
        return new user();
    }

    public String get_user_data(int user_id)throws SQLException, ClassNotFoundException {
        String d = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select ch_age from characteristic  where ch_user_id = '" + user_id + "'";
            ResultSet resSet = statement.executeQuery(sql_code);
            while (resSet.next()) {
                d = resSet.getString("ch_age");
            }

        }
        return d;
    }


    public void edit_user(user user, int u_id)throws SQLException, ClassNotFoundException{
        System.out.println("foprt");
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
//
            String sql_code = "update information set i_name = '"+user.getName_u()+"', i_surname = '"+user.getSurname_u()+"', i_number = '"+user.getNumber_u()+"', i_email = '"+user.getEmail()+"' where i_user_id = '"+u_id+"'";
            statement.executeUpdate(sql_code);

            sql_code = "update characteristic set ch_age = '"+user.getAge_u()+"', ch_grow = '"+user.getGrow_u()+"', ch_weight = '"+user.getWeight_u()+"' where ch_user_id = '"+u_id+"'";
            statement.executeUpdate(sql_code);
        }
    }

}
