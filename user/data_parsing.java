package user;

public class data_parsing {
    public int[] data_db(String str){
        int[] result = new int[3];
        result[0] = Integer.parseInt(str.substring(0,4));
        result[1] = Integer.parseInt(str.substring(5,7));
        result[2] = Integer.parseInt(str.substring(8));
        return result;
    }
}
