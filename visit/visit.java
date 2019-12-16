package visit;

public class visit {
    private String data_visit;
    private String time_visit;
    private String comment_visit;
    private String name_clinick;
    private String addres_clinick;
    private int number_clinick;
    private String name_doctor;
    private String surname_doctor;
    private String midlename_doctor;
    private int number_doctor;
    private String email_doctor;
    private int clinic_id;
    private int doctor_id;

    public visit(){};

    public visit(String data_visit, String time_visit, String comment_visit, String name_clinick, String addres_clinick, int number_clinick, String name_doctor, String surname_doctor, String midlename_doctor, int number_doctor, String email_doctor, int clinic_id, int doctor_id){
        this.data_visit = data_visit;
        this.time_visit = time_visit;
        this.comment_visit = comment_visit;
        this.name_clinick = name_clinick;
        this.addres_clinick = addres_clinick;
        this.number_clinick = number_clinick;
        this.name_doctor = name_doctor;
        this.surname_doctor = surname_doctor;
        this.midlename_doctor = midlename_doctor;
        this.number_doctor = number_doctor;
        this.email_doctor = email_doctor;
        this.clinic_id = clinic_id;
        this.doctor_id = doctor_id;
    }

    public String getData_visit() {
        return data_visit;
    }

    public void setData_visit(String data_visit) {
        this.data_visit = data_visit;
    }

    public String getTime_visit() {
        return time_visit;
    }

    public void setTime_visit(String time_visit) {
        this.time_visit = time_visit;
    }

    public String getComment_visit() {
        return comment_visit;
    }

    public void setComment_visit(String comment_visit) {
        this.comment_visit = comment_visit;
    }

    public String getName_clinick() {
        return name_clinick;
    }

    public void setName_clinick(String name_clinick) {
        this.name_clinick = name_clinick;
    }

    public String getAddres_clinick() {
        return addres_clinick;
    }

    public void setAddres_clinick(String addres_clinick) {
        this.addres_clinick = addres_clinick;
    }

    public int getNumber_clinick() {
        return number_clinick;
    }

    public void setNumber_clinick(int number_clinick) {
        this.number_clinick = number_clinick;
    }

    public String getName_doctor() {
        return name_doctor;
    }

    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }

    public String getSurname_doctor() {
        return surname_doctor;
    }

    public void setSurname_doctor(String surname_doctor) {
        this.surname_doctor = surname_doctor;
    }

    public String getMidlename_doctor() {
        return midlename_doctor;
    }

    public void setMidlename_doctor(String midlename_doctor) {
        this.midlename_doctor = midlename_doctor;
    }

    public int getNumber_doctor() {
        return number_doctor;
    }

    public void setNumber_doctor(int number_doctor) {
        this.number_doctor = number_doctor;
    }

    public String getEmail_doctor() {
        return email_doctor;
    }

    public void setEmail_doctor(String email_doctor) {
        this.email_doctor = email_doctor;
    }

    public int getClinic_id() {
        return clinic_id;
    }

    public void setClinic_id(int clinic_id) {
        this.clinic_id = clinic_id;
    }


    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    @Override
    public String toString() {
        return "visit{" + "data_visit=" + data_visit + ", time_visit='" + time_visit + '\'' + ", comment_visit='" + comment_visit + '\'' + ", clinic_name=" + name_clinick + ", addres_clinick='" + addres_clinick + '\'' + ", number_clinick='" + number_clinick + '\'' + ", name_doctor=" + name_doctor + '\'' + ", midlename_doctor=" + midlename_doctor + '\'' + ", surname_docrot=" + surname_doctor + '\'' + ", number_doctor=" + name_doctor + '\'' + ",email_doctor=" + email_doctor +'}';
    }


}
