package visit;

import user.controler_user;

import java.sql.*;

public class informatoin_database extends database_visit {
    controler_user contr = new  controler_user();
    private int user_id = 3;

    public String [] all_clinick(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select clinic_id from clinic";
            ResultSet resSet = statement.executeQuery(sql_code);
            int c =0;
            while (resSet.next()) {
                c += 1;
            }
            String[] result =new String[c+1];
            result [0] = "  ";
            sql_code = "select c_name from clinic";
            resSet = statement.executeQuery(sql_code);
            int i = 1;
            while (resSet.next()) {
                result [i] = resSet.getString("c_name");
                i+=1;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[] rest = {};
        return rest;
    }

    public String [] all_doctors(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select doctor_id from doctor";
            ResultSet resSet = statement.executeQuery(sql_code);
            int c =0;
            while (resSet.next()) {
                c += 1;
            }
            String[] result =new String[c+1];
            result [0] = "  ";
            sql_code = "select d_name, d_midlename, d_surname from doctor";
            resSet = statement.executeQuery(sql_code);
            int i = 1;
            while (resSet.next()) {
                result [i] = resSet.getString("d_surname") + " " + resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                i+=1;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[] rest = {};
        return rest;
    }

    public String [] doctors(String cl){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(cl);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
            String sql_code_2 = "select clinic_doctor_id from clinic_doctor inner join clinic on clinic_doctor.c_d_clinic_id = clinic.clinic_id where c_name = '"+cl+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String[] result =new String[c+1];
            result [0] = "  ";
            String sql_code = "select d_surname, d_name, d_midlename, c_name from clinic inner join clinic_doctor on clinic_id = c_d_clinic_id inner join doctor on c_d_doctor_id = doctor_id where c_name = '"+cl+"'";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 1;
            System.out.println(resSet);
            while (resSet.next()) {
                result [i] = resSet.getString("d_surname") + " " + resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                i+=1;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[] rest = {};
        return rest;
    }

    public int id_clinick(String name){
        int result = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
            String sql_code = "select clinic_id from clinic where c_name = '" + name + "'";
            ResultSet resSet = statement.executeQuery(sql_code);
            while (resSet.next()) {
                result = resSet.getInt("clinic_id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int id_doctor(String surname, String name, String midlename){
        int result = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select doctor_id, d_name, d_surname, d_midlename from doctor where d_name = '" + name + "' and  d_surname = '"+surname+"' and d_midlename = '"+midlename+"'";
            ResultSet resSet = statement.executeQuery(sql_code);
            while (resSet.next()) {
                result = resSet.getInt("doctor_id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String[][] all_visit(int user_id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code_2 = "select visit_id from visit where v_user_id = '"+user_id+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String[][] result =new String[5][c];
            String sql_code = "select clinic.c_name, doctor.d_name, doctor.d_surname, doctor.d_midlename, visit.v_data, visit.v_time, visit.visit_id from doctor inner join visit_doctor on doctor.doctor_id = visit_doctor.v_d_doctor_id inner join visit on visit_doctor.v_d_visit_id = visit.visit_id inner join clinic on clinic.clinic_id = visit.v_clinick_id where visit.v_user_id = '"+user_id+"' group by visit.v_data desc";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 0;
            while (resSet.next()) {
                result[0][i] = String.valueOf(resSet.getDate("v_data"));
                result[1][i] = String.valueOf(resSet.getTime("v_time"));
                result[2][i] = resSet.getString("c_name");
                result[3][i] = resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                result[4][i] = String.valueOf(resSet.getInt("visit_id"));
                i+=1;
            }
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[][] res = new String[1][1];
        return res;
    }

    public String addres(String cl){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(cl);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
            String sql_code_2 = "select clinic_doctor_id from clinic_doctor inner join clinic on clinic_doctor.c_d_clinic_id = clinic.clinic_id where c_name = '"+cl+"'";
            String result = "";
            String sql_code = "select c_addres from clinic where c_name = '"+cl+"'";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 1;
            System.out.println(resSet);
            while (resSet.next()) {
                result = resSet.getString("c_addres");
                i+=1;
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String rest = " ";
        return rest;
    }

    public String classification(int docto_id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
            String sql_code_2 = "select doctor_classification_id from doctor_classification where d_c_doctor = '"+docto_id+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String result = "";
            String sql_code = "select classification.c_name from classification inner join doctor_classification on classification.classification_id = doctor_classification.d_c_doctor where d_c_doctor = '"+docto_id+"'";
            ResultSet resSet = statement.executeQuery(sql_code);
            while (resSet.next()) {
                result += resSet.getString("c_name") + " ";
            }

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String rest = "";
        return rest;
    }

    public String[][] search_doctor(int doc_id, int user_id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code_2 = "select visit_doctor_id from visit inner join visit_doctor on visit.visit_id = visit_doctor.v_d_visit_id where v_d_doctor_id = '"+doc_id+"' and v_user_id = '"+user_id+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String[][] result =new String[5][c];
            String sql_code = "select clinic.c_name, doctor.d_name, doctor.d_surname, doctor.d_midlename, visit.v_data, visit.v_time, visit.visit_id from doctor inner join visit_doctor on doctor.doctor_id = visit_doctor.v_d_doctor_id inner join visit on visit_doctor.v_d_visit_id = visit.visit_id inner join clinic on clinic.clinic_id = visit.v_clinick_id where visit_doctor.v_d_doctor_id = '"+doc_id+"' and v_user_id = '"+user_id+"' group by visit.v_data desc";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 0;
            while (resSet.next()) {
                result[0][i] = String.valueOf(resSet.getDate("v_data"));
                result[1][i] = String.valueOf(resSet.getTime("v_time"));
                result[2][i] = resSet.getString("c_name");
                result[3][i] = resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                result[4][i] = String.valueOf(resSet.getInt("visit_id"));
                i+=1;
            }
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[][] res = new String[1][1];
        return res;
    }

    public String[][] search_clinic(int doc_id, int user_id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code_2 = "select visit_id from visit where v_clinick_id = '"+doc_id+"' and v_user_id = '"+user_id+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String[][] result =new String[5][c];
            String sql_code = "select clinic.c_name, doctor.d_name, doctor.d_surname, doctor.d_midlename, visit.v_data, visit.v_time, visit.visit_id from doctor inner join visit_doctor on doctor.doctor_id = visit_doctor.v_d_doctor_id inner join visit on visit_doctor.v_d_visit_id = visit.visit_id inner join clinic on clinic.clinic_id = visit.v_clinick_id where visit.v_clinick_id = '"+doc_id+"' and v_user_id = '"+user_id+"' group by visit.v_data desc";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 0;
            while (resSet.next()) {
                result[0][i] = String.valueOf(resSet.getDate("v_data"));
                result[1][i] = String.valueOf(resSet.getTime("v_time"));
                result[2][i] = resSet.getString("c_name");
                result[3][i] = resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                result[4][i] = String.valueOf(resSet.getInt("visit_id"));
                i+=1;
            }
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[][] res = new String[1][1];
        return res;
    }

    public String[][] search_data(String dat, int user_id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code_2 = "select visit_id from visit where v_data = '"+dat+"' and v_user_id = '"+user_id+"'";
            ResultSet resSet_2 = statement.executeQuery(sql_code_2);
            int c =0;
            while (resSet_2.next()) {
                c += 1;
            }
            String[][] result =new String[5][c];
            String sql_code = "select clinic.c_name, doctor.d_name, doctor.d_surname, doctor.d_midlename, visit.v_data, visit.v_time, visit.visit_id from doctor inner join visit_doctor on doctor.doctor_id = visit_doctor.v_d_doctor_id inner join visit on visit_doctor.v_d_visit_id = visit.visit_id inner join clinic on clinic.clinic_id = visit.v_clinick_id where visit.v_data = '"+dat+"' and v_user_id = '"+user_id+"' group by visit.v_data desc";
            ResultSet resSet = statement.executeQuery(sql_code);
            int i = 0;
            while (resSet.next()) {
                result[0][i] = String.valueOf(resSet.getDate("v_data"));
                result[1][i] = String.valueOf(resSet.getTime("v_time"));
                result[2][i] = resSet.getString("c_name");
                result[3][i] = resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                result[4][i] = String.valueOf(resSet.getInt("visit_id"));
                i+=1;
            }
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[][] res = new String[1][1];
        return res;
    }


    public String one_visit(int visit_id){
        String visit_information = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select d_surname, d_name, d_midlename,clinic.c_name, classification.c_name, c_addres, v_data, v_time, c_number, v_comment from clinic inner join visit v on clinic.clinic_id = v.v_clinick_id  inner join visit_doctor vd on v.visit_id = vd.v_d_visit_id inner join doctor d on vd.v_d_doctor_id = d.doctor_id inner join doctor_classification on d.doctor_id = doctor_classification.d_c_doctor inner join classification on doctor_classification.d_c_classification = classification.classification_id where visit_id = '"+visit_id+"'";
            ResultSet resSet = statement.executeQuery(sql_code);

            while (resSet.next()) {

                visit_information += "Лікар: " + resSet.getString("d_surname") + " " + resSet.getString("d_name") + " " + resSet.getString("d_midlename") + "\n";
                visit_information += "Лікарня: " + resSet.getString("clinic.c_name") + "\n";
                visit_information += "Класифікація: " + resSet.getString("classification.c_name") + "\n";
                visit_information += "Адреса: " + resSet.getString("c_addres") + "\n";
                visit_information += "Дата: " + resSet.getString("v_data") + "\n";
                visit_information += "Час: " + resSet.getString("v_time") + "\n";
                visit_information += "Телефон: " + resSet.getString("c_number") + "\n";
                visit_information += "Коментарій" + resSet.getString("v_comment");

            }




        } catch (SQLException e) {
            e.printStackTrace();
        }
        return visit_information;

    }



    public String[] edit_visit(int visit_id){
        String[] visit_information = new String[7];

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password); Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select * from information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id");
//            statement.executeUpdate("INSERT INTO information innner join users on i_user_id = users.user_id inner join characteristic on characteristic.ch_user_id = users.user_id (i_name, i_surname, i_number, i_email, i_user_id, ch_age, ch_grow, ch_weight, ch_user_id) values (?,?,?,?,?,?,?,?,?)");
            String sql_code = "select d_surname, d_name, d_midlename,clinic.c_name, classification.c_name, c_addres, v_data, v_time, v_comment from clinic inner join visit v on clinic.clinic_id = v.v_clinick_id  inner join visit_doctor vd on v.visit_id = vd.v_d_visit_id inner join doctor d on vd.v_d_doctor_id = d.doctor_id inner join doctor_classification on d.doctor_id = doctor_classification.d_c_doctor inner join classification on doctor_classification.d_c_classification = classification.classification_id where visit_id = '"+visit_id+"'";
            ResultSet resSet = statement.executeQuery(sql_code);

            while (resSet.next()) {
                visit_information[0] = resSet.getString("v_data");
                visit_information[1] = resSet.getString("v_time");
                visit_information[2] = resSet.getString("d_surname") + " " + resSet.getString("d_name") + " " + resSet.getString("d_midlename");
                visit_information[3] = resSet.getString("clinic.c_name");
                visit_information[4] = resSet.getString("classification.c_name");
                visit_information[5] = resSet.getString("c_addres");
                visit_information[6] = resSet.getString("v_comment");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return visit_information;

    }




}
