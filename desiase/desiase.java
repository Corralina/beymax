package desiase;

public class desiase {

    private int id_d;
    private String name_d;
    private String discription_d;
    private String date;

    public desiase() {};

    public desiase(int id_d, String name_d, String discription_d, String date_d){
        this.name_d = name_d;
        this.discription_d = discription_d;
        this.date = date_d;
        this.id_d = id_d;
    }

    public String getName_d() {
        return name_d;
    }

    public void setName_d(String name_d) {
        this.name_d = name_d;
    }

    public String getDiscription_d() {
        return discription_d;
    }

    public void setDiscription_d(String discription_d) {
        this.discription_d = discription_d;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public int getId_d() {
        return id_d;
    }

    public void setId_d(int id_d) {
        this.id_d = id_d;
    }

    @Override
    public String toString() {
        return "desiase{" + "id_u=" + id_d + ", name_d='" + name_d + '\'' + ", discription_d='" + discription_d + '\'' + ", date_d=" + date + "'}'";
    }
}
