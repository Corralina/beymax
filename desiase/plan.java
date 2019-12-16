package desiase;

public class plan {

    private int id_p;
    private String name_p;
    private String data_start;
    private String data_stop;
    private float count_p;
    private String marcking_p;

    public plan() {};

    public plan(int id_p, String name_p, String data_start, String data_stop, int count_p, String marcking_p){
        this.id_p = id_p;
        this.name_p = name_p;
        this.data_start = data_start;
        this.data_stop = data_stop;
        this.count_p = count_p;
        this.marcking_p = marcking_p;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getName_p() {
        return name_p;
    }

    public void setName_p(String name_p) {
        this.name_p = name_p;
    }

    public String getData_start() {
        return data_start;
    }

    public void setData_start(String data_start) {
        this.data_start = data_start;
    }

    public String getData_stop() {
        return data_stop;
    }

    public void setData_stop(String data_stop) {
        this.data_stop = data_stop;
    }

    public float getCount_p() {
        return count_p;
    }

    public void setCount_p(float count_p) {
        this.count_p = count_p;
    }

    public String getMarcking_p() {
        return marcking_p;
    }

    public void setMarcking_p(String marcking_p) {
        this.marcking_p = marcking_p;
    }
    


}
