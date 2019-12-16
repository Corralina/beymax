package visit;

import java.sql.*;

public class edit_visit_database extends database_visit {
    public void create_visit(visit visit, int visit_id)throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        int v_i = 0;
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()){
            String sql_code = "update visit set v_data = '"+visit.getData_visit()+"', v_time = '"+visit.getTime_visit()+"', v_comment = '"+visit.getComment_visit()+"', v_clinick_id = '"+visit.getClinic_id()+"' where visit_id = '"+visit_id+"'";
            statement.executeUpdate(sql_code);

            sql_code = "update visit_doctor set v_d_doctor_id = '"+visit.getDoctor_id()+"' where v_d_visit_id = '"+visit_id+"'";
            statement.executeUpdate(sql_code);


        }
    }
}
