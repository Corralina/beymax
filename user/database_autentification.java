package user;

import java.sql.*;


public class database_autentification extends database_user{



    public Integer autentification(String login_u, String password_u) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                if(resultSet.getString("u_login").equals(login_u) && resultSet.getString("u_password").equals(password_u)){
                    user_id = resultSet.getInt("user_id");
                    return user_id;
                }
            }
        }
        int k = 0;
        return k;
    }

    public Integer search_login(String login_u) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                if(resultSet.getString("u_login").equals(login_u)){
                    return 1;
                }
            }
        }
        int k = 0;
        return k;
    }

}
