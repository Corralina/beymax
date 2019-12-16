package visit;

import java.sql.*;

public class delete_visit_database extends database_visit {
    public void delete_doctor_v(int visit_i){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            String sql_code = "delete from visit_doctor where v_d_visit_id = '"+visit_i+"'";
            statement.executeUpdate(sql_code);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete_visit(int visit_i){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            String sql_code = "delete from visit where visit_id = '"+visit_i+"'";
            PreparedStatement preparedStatement = connection.prepareStatement(sql_code);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
