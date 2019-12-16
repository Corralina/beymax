package visit;

import basis.controler;

import java.sql.SQLException;

public class controler_visit {
    informatoin_database informatoin_database = new informatoin_database();
    data_processing data_processing =new data_processing();
    database_create_visit database_create_visit = new database_create_visit();
    create_visit create_visit = new create_visit();
    delete_visit_database delete_visit = new delete_visit_database();
    edit_visit_database edit_database = new edit_visit_database();
    controler contr = new controler();
    private int id = contr.id;

    public String[] clinick_list(String doctor)throws SQLException, ClassNotFoundException{
        String [] result= {};
        if (doctor == null){
            return informatoin_database.all_clinick();
        }else{

        }
        return result;
    }

    public String[] docotr_list(String clinick)throws SQLException, ClassNotFoundException{
        String [] result= new String[2];
        if (clinick == null){
            return informatoin_database.all_doctors();
        }else{
            return informatoin_database.doctors(clinick);
        }
    }

    public void new_visit_data(int year, int mount,int day, int hour, int minute, int second, String clinic, String doctor, String comment, int user_id)throws SQLException, ClassNotFoundException{
        int id_clinic = 0;
        int id_doctor = 0;
        if (clinic != null){
            id_clinic = informatoin_database.id_clinick(clinic);
        }
        if(doctor != null){
            String [] doc = data_processing.doctor_pars(doctor);
            id_doctor = informatoin_database.id_doctor(doc[0], doc[1], doc[2]);
        }
        database_create_visit.create_visit(create_visit.start_new(data_processing.data(year, mount, day), data_processing.time(hour, minute, second), comment, id_clinic, id_doctor), user_id);


    }

    public void edit_visit_save(int year, int mount,int day, int hour, int minute, int second, String clinic, String doctor, String comment, int visit_id)throws SQLException, ClassNotFoundException{

        int id_clinic = 0;
        int id_doctor = 0;
        if (clinic != null){
            id_clinic = informatoin_database.id_clinick(clinic);
        }
        if(doctor != null){
            String [] doc = data_processing.doctor_pars(doctor);
            id_doctor = informatoin_database.id_doctor(doc[0], doc[1], doc[2]);
        }
        edit_database.create_visit(create_visit.start_new(data_processing.data(year, mount, day), data_processing.time(hour, minute, second), comment, id_clinic, id_doctor), visit_id);


    }

    public String[][] show_all_visit(int user_id)throws SQLException, ClassNotFoundException{
        return informatoin_database.all_visit(user_id);
    }

    public String show_adress(String name)throws SQLException, ClassNotFoundException{
        return informatoin_database.addres(name);
    }

    public String  show_classification(String name)throws SQLException, ClassNotFoundException{
        String [] doc = data_processing.doctor_pars(name);
        return informatoin_database.classification( informatoin_database.id_doctor(doc[0], doc[1], doc[2]));

    }

    public void delete_visit(int visit_i)throws SQLException, ClassNotFoundException{
        delete_visit.delete_doctor_v(visit_i);
        delete_visit.delete_visit(visit_i);

    }

    public String[][] search_doctor(String docs, int user_id)throws SQLException, ClassNotFoundException{
        String [] doc = data_processing.doctor_pars(docs);
        return informatoin_database.search_doctor( informatoin_database.id_doctor(doc[0], doc[1], doc[2]), user_id);
    }

    public String[][] search_clinic(String clin, int user_id)throws SQLException, ClassNotFoundException{
        return informatoin_database.search_clinic( informatoin_database.id_clinick(clin),user_id);
    }

    public String[][] search_date(String date, int user_id)throws SQLException, ClassNotFoundException{
        return informatoin_database.search_data(date, user_id);
    }

    public String one_visit(int visit_id)throws SQLException, ClassNotFoundException{
        return informatoin_database.one_visit(visit_id);
    }

    public String[] edit_visit(int visit_id){
        String[] res_1 = informatoin_database.edit_visit(visit_id);
        String[] result = new String[11];
        int[] date = data_processing.data_db(res_1[0]);
        int[] time = data_processing.time_db(res_1[1]);
        result[0] = String.valueOf(date[0]);
        result[1] = String.valueOf(date[1]);
        result[2] = String.valueOf(date[2]);
        result[3] = String.valueOf(time[0]);
        result[4] = String.valueOf(time[1]);
        result[5] = String.valueOf(time[2]);
        result[6] = res_1[2];
        result[7] = res_1[3];
        result[8] = res_1[4];
        result[9] = res_1[5];
        result[10] = res_1[6];

        return result;
    }


}
