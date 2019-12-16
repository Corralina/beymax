package user;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class alter_user {

    private controler_user controler_user = new controler_user();

    public String data_name;
    public String data_surname;
    public String data_age;
    public int data_grow;
    public int data_weight;
    public String data_number;
    public String data_email;
    public String login_r;
    public String password_r;
    public user user;
    public user user_final;
    public int age_year;
    public int age_mount;
    public int age_day;

    public Integer[] mas_yers = new Integer[]{2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2000, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980, 1979, 1978, 1977, 1976, 1975, 1974, 1973, 1972, 1971, 9970, 1969, 1968, 1967, 1966, 1965, 1964, 1963, 1962, 1961, 9960};
    public Integer[] mas_mounts = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public Integer[] mas_days = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    public Integer [] parametrs ={
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99,
            100,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,
            138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,
            175,176,177,178,179,180,181,182,183,184,185,186,187,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212
    };


    public JTextField edit_name;
    public JTextField edit_surname;
    public JTextField edit_number;
    public JTextField edit_email;
    public JTextField edit_grow;
    public JTextField edit_weight;
    public JComboBox r_age_year;
    public JComboBox r_age_day;
    public JComboBox r_grow_text;
    public JComboBox r_weight_text;
    public JComboBox r_age_mounts;


    public JPanel newJPanel(int us_id) {

        try {
            fence(us_id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Font BigFontTR = new Font("Comic Sans MS", Font.BOLD, 130);
        Font BigFontTR_1 = new Font("Comic Sans MS", Font.BOLD, 70);
        Font BigFontTR_2 = new Font("Comic Sans MS", Font.BOLD, 50);
        Font BigFontTR_3 = new Font("Comic Sans MS", Font.BOLD, 40);
        Font BigFontTR_4 = new Font("Comic Sans MS", Font.BOLD, 30);
        Font BigFontTR_5 = new Font("Comic Sans MS", Font.BOLD, 20);

        Color color_1 = new Color(210, 190, 181);
        Color color_2 = new Color(125, 1, 1);
        Color color_4 = new Color(210, 190, 181);

        ImageIcon image_5 = new ImageIcon("D:\\stady\\pictures\\b_1.png");
        ImageIcon image_6 = new ImageIcon("D:\\stady\\pictures\\b_1.png");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1900, 590);

        edit_name = new JTextField(data_name);
        edit_name.setBounds(100, 100, 300, 50);
        edit_name.setFont(new Font("Dialog", 0, 30));
        panel.add(edit_name);
        edit_surname = new JTextField(data_surname);
        edit_surname.setBounds(100, 200, 300, 50);
        edit_surname.setFont(new Font("Dialog", 0, 30));
        panel.add(edit_surname);
        edit_number = new JTextField(data_number);
        edit_number.setBounds(100, 300, 300, 50);
        edit_number.setFont(new Font("Dialog", 0, 30));
        panel.add(edit_number);
        edit_email = new JTextField(data_email);
        edit_email.setBounds(100, 400, 700, 50);
        edit_email.setFont(new Font("Dialog", 0, 30));
        panel.add(edit_email);





        r_age_year = new JComboBox(mas_yers);
        r_age_year.setBounds(500, 100, 150, 50);
        r_age_year.setSelectedItem(age_year);
        r_age_year.setFont(BigFontTR_3);
        panel.add(r_age_year);


        r_age_mounts = new JComboBox(mas_mounts);
        r_age_mounts.setBounds(670, 100, 80, 50);
        r_age_mounts.setFont(BigFontTR_3);
        r_age_mounts.setSelectedItem(age_mount);
        panel.add(r_age_mounts);

        r_age_day = new JComboBox(mas_days);
        r_age_day.setBounds(770, 100, 80, 50);
        r_age_day.setFont(BigFontTR_3);
        r_age_day.setSelectedItem(age_day);
        panel.add(r_age_day);

        r_grow_text = new JComboBox(parametrs);
        r_grow_text.setBounds(500, 200, 300, 50);
        r_grow_text.setFont(BigFontTR_3);
        r_grow_text.setSelectedItem(data_grow);
        panel.add(r_grow_text);

        r_weight_text = new JComboBox(parametrs);
        r_weight_text.setBounds(500, 300, 300, 50);
        r_weight_text.setFont(BigFontTR_3);
        r_weight_text.setSelectedItem(data_weight);
        panel.add(r_weight_text);






        return panel;
    }
    public void edit_save(int user_id)throws SQLException, ClassNotFoundException{
        System.out.println(data_name);
        data_name = edit_name.getText();
        data_surname = edit_surname.getText();
        data_number = edit_number.getText();
        data_email = edit_email.getText();
        data_grow = (int)r_grow_text.getSelectedItem();
        data_weight = (int)r_weight_text.getSelectedItem();
        age_year = (int) r_age_year.getSelectedItem();
        age_mount = (int) r_age_mounts.getSelectedItem();
        age_day = (int) r_age_day.getSelectedItem();
        System.out.println("first");
        controler_user.save_edit_v(data_name,data_surname,Integer.parseInt(data_number),data_email,age_year,age_mount,age_day,data_grow,data_weight,user_id);
    }

    public void fence(int user_id)throws SQLException, ClassNotFoundException{
        user = controler_user.menu_data_user(user_id);
        data_name = user.getName_u();
        data_surname = user.getSurname_u();
        data_number = String.valueOf(user.getNumber_u());
        data_email = String.valueOf(user.getEmail());
        data_age = user.getAge_u_2();
        data_grow = user.getGrow_u();
        data_weight = user.getWeight_u();
        int [] ag = controler_user.get_d(user_id);
        age_year = ag[0];
        age_mount = ag[1];
        age_day = ag[2];

    }
}
