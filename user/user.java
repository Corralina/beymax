package user;

import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
    private int id_u;
    private String surname_u;
    private String name_u;
    private int number_u;
    private String email;
    private int grow_u;
    private Integer year_u;
    private Integer mount_u;
    private Integer day_u;
    private String age_u;
    private String age_u_2;
    private int weight_u;

    public user() {};

    public user(int id_u, String surname_u, String name_u, int number_u, String email, int grow_u, Integer year_u, Integer mount_u, Integer day_u, int weight_u, String age_u_2) {
        this.id_u = id_u;
        this.surname_u = surname_u;
        this.name_u = name_u;
        this.number_u = number_u;
        this.email = email;
        this.grow_u = grow_u;
        this.year_u = year_u;
        this.mount_u = mount_u;
        this.day_u = day_u;
        this.weight_u = weight_u;
        this.age_u_2 = age_u_2;
    }


    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
        System.out.println(this.id_u + "set");
    }

    public String getSurname_u() {
        return surname_u;
    }

    public void setSurname_u(String surname_u) {
        this.surname_u = surname_u;
    }

    public String getName_u() {
        System.out.println(name_u + "get");
        System.out.println(this.name_u + "getthis");
        return name_u;
    }

    public void setName_u(String name_u) {
        this.name_u = name_u;
        System.out.println(this.name_u + "set");
    }

    public int getNumber_u() {
        return number_u;
    }

    public void setNumber_u(int number_u) {
        this.number_u = number_u;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge_u() {
        return age_u;
    }

    public void setAge_u(Integer year_u, Integer mount_u, Integer day_u) {
        this.age_u = year_u + "-" + mount_u + "-" + day_u;
    }

    public String getAge_u_2() {
        return age_u_2;
    }

    public void setAge_u_2(Date age) {
        String r = String.valueOf(age);
        java.util.Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy");
        SimpleDateFormat formatForDateNow_2 = new SimpleDateFormat("MM");
        SimpleDateFormat formatForDateNow_3 = new SimpleDateFormat("dd");
        int a = Integer.parseInt(formatForDateNow.format(date));
        int b = Integer.parseInt(r.substring(0,4));
        int f = a - b - 1;
        if (Integer.parseInt(formatForDateNow_2.format(date)) > Integer.parseInt(r.substring(5,7))){
            f += 1;
        }else if(Integer.parseInt(formatForDateNow_2.format(date)) == Integer.parseInt(r.substring(5,7)) && Integer.parseInt(formatForDateNow_3.format(date)) >= Integer.parseInt(r.substring(8,10))){
            f += 1;
        }
        this.age_u_2 = String.valueOf(f);
    }

    public int getGrow_u() {
        return grow_u;
    }

    public void setGrow_u(int grow_u) {
        this.grow_u = grow_u;
    }

    public int getWeight_u() {
        return weight_u;
    }

    public void setWeight_u(int weight_u) {
        this.weight_u = weight_u;
    }


    @Override
    public String toString() {
        return "registration{" + "id_u=" + id_u + ", surname_u='" + surname_u + '\'' + ", name_u='" + name_u + '\'' + ", number_u=" + number_u + ", email='" + email + '\'' + ", age_u='" + age_u_2 + '\'' + ", grow_u=" + grow_u + '}';
    }
}
