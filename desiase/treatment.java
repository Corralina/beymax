package desiase;

public class treatment {

    private int id_t;
    private int id_desiase;
    private int id_doctor;

    public treatment() {};

    public treatment(int id_t, int id_desiase, int id_doctor){
        this.id_t = id_t;
        this.id_desiase = id_desiase;
        this.id_doctor = id_doctor;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public int getId_desiase() {
        return id_desiase;
    }

    public void setId_desiase(int id_desiase) {
        this.id_desiase = id_desiase;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    @Override
    public String toString() {
        return "treatment{" + "id_u=" + id_t + ", id_doctor='" + id_doctor + '\'' + ", id_desiase='" + id_desiase + "'}'";
    }
}
