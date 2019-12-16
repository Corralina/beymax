package visit;

public class create_visit {
    public static visit start_new(String data_visit, String time_visit, String comment_visit, int clinic_id, int doctor_id){
        visit v = new visit();
        v.setData_visit(data_visit);
        v.setTime_visit(time_visit);
        v.setComment_visit(comment_visit);
        v.setClinic_id(clinic_id);
        v.setDoctor_id(doctor_id);
        return new visit(data_visit, time_visit, comment_visit, null, null, 0, null, null, null, 0, null, clinic_id,  doctor_id);
    }
}
