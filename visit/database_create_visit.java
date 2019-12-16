package visit;

import java.sql.*;

public class database_create_visit extends database_visit {

    public void create_visit(visit visit, int user_id)throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        int v_i = 0;
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            String sql_code_inf = "INSERT INTO visit (v_data, v_time, v_comment, v_user_id, v_clinick_id) values (?, ?, ?, ?, ?)";
            String sql_code_pr = "INSERT INTO visit_doctor (v_d_doctor_id, v_d_visit_id) values (?,?)";
            PreparedStatement preparedStatement_inf = connection.prepareStatement(sql_code_inf, PreparedStatement.RETURN_GENERATED_KEYS);
            PreparedStatement preparedStatement_pr = connection.prepareStatement(sql_code_pr);
            preparedStatement_inf.setString(1, visit.getData_visit());
            preparedStatement_inf.setString(2, visit.getTime_visit());
            preparedStatement_inf.setString(3, visit.getComment_visit());
            preparedStatement_inf.setInt(4, user_id);//change user_id
            preparedStatement_inf.setInt(5, visit.getClinic_id());
            preparedStatement_inf.executeUpdate();
            try (ResultSet i = preparedStatement_inf.getGeneratedKeys()) {
                if (i.next()) {
                    v_i = (i.getInt(1));
                }
            }

            preparedStatement_pr.setInt(1, visit.getDoctor_id());
            preparedStatement_pr.setInt(2, v_i);

            preparedStatement_pr.execute();

        }
    }
}
