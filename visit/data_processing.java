package visit;

public class data_processing {
    public String data(int year, int mount, int day){
        return year + "-" + mount + "-" + day;
    }

    public String time(int hour, int minutes, int second){
        return hour + ":" + minutes + ":" + second;
    }

    public String[] doctor_pars(String doc){
        String [] result = new String[3];
        int start = 0;
        int stop = doc.indexOf(" ");
        result[0] = doc.substring(start,stop);
        start = stop + 1;
        stop = doc.indexOf(" ", start);
        result[1] = doc.substring(start,stop);
        start = stop + 1;
        result[2] = doc.substring(start);
        return result;
    }

    public int[] data_db(String str){
        int[] result = new int[3];
        result[0] = Integer.parseInt(str.substring(0,4));
        result[1] = Integer.parseInt(str.substring(5,7));
        result[2] = Integer.parseInt(str.substring(8));
        return result;
    }

    public int[] time_db(String str){
        int[] result = new int[3];
        result[0] = Integer.parseInt(str.substring(0,2));
        result[1] = Integer.parseInt(str.substring(3,5));
        result[2] = Integer.parseInt(str.substring(6));
        return result;
    }
}
