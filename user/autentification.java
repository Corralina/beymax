package user;

import basis.controler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class autentification {
    controler contr = new controler();


    JTextField r_name_text;
    JTextField r_surname_text;
    JTextField r_number_text;
    JTextField r_email_text;
    JComboBox r_age_year;
    JComboBox r_age_day;
    JComboBox r_grow_text;
    JComboBox r_weight_text;
    JComboBox r_age_mounts;


    private controler_user controler_user = new controler_user();
    private int user_id = 0;
    public String login_1;
    public String password_1;
    public String login_2;
    public String password_2;
    public String password_2_2;
    public int registration_result = 0;
    public JButton r_end = new JButton("Готово");
    public Integer [] mas_yers = {
            2019,2018,2017,2016,2015,2014,2013,2012,2011,2010,2009,2008,2007,2006,2005,2004,2003,2002,2000,1999,1998,1997,
            1996,1995,1994,1993,1992,1991,1990,1989,1988,1987,1986,1985,1984,1983,1982,1981,1980,1979,1978,1977,1976,1975,
            1974,1973,1972,1971,9970,1969,1968,1967,1966,1965,1964,1963,1962,1961,1960
    };
    public Integer [] mas_mounts ={
            1,2,3,4,5,6,7,8,9,10,11,12
    };
    public Integer [] mas_days = {
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
    };
    public Integer [] parametrs ={
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99,
            100,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,
            138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,
            175,176,177,178,179,180,181,182,183,184,185,186,187,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212
    };
    //    public grafic g = new grafic();
    public JPanel newJPanel(int us_id){
        user_id = us_id;
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
        panel.setBounds(0,0,1900,1050);

        JLabel img_autentification = new JLabel(image_5);
        img_autentification.setBounds(810, 0, 1200, 1000);
        panel.add(img_autentification);



//Sing in process
        //Name
        JLabel r_name = new JLabel("Ім'я:");
        r_name.setFont(BigFontTR_3);
        r_name.setBounds(150, 50, 500, 80);
        panel.add(r_name);

        r_name_text = new JTextField();
        r_name_text.setBounds(150, 135, 500, 50);
        r_name_text.setFont(BigFontTR_3);
        panel.add(r_name_text);
        //Surname
        JLabel r_surname = new JLabel("Прізвище:");
        r_surname.setFont(BigFontTR_3);
        r_surname.setBounds(150, 220, 500, 80);
        panel.add(r_surname);

        r_surname_text = new JTextField();
        r_surname_text.setBounds(150, 305, 500, 50);
        r_surname_text.setFont(BigFontTR_3);
        panel.add(r_surname_text);
        //Number
        JLabel r_number = new JLabel("Номер телефону:");
        r_number.setFont(BigFontTR_3);
        r_number.setBounds(150, 390, 500, 80);
        panel.add(r_number);

        r_number_text = new JTextField();
        r_number_text.setBounds(150, 475, 500, 50);
        r_number_text.setFont(BigFontTR_3);
        panel.add(r_number_text);
        //Email
        JLabel r_email = new JLabel("Електрона адреса:");
        r_email.setFont(BigFontTR_3);
        r_email.setBounds(150, 560, 500, 80);
        panel.add(r_email);

        r_email_text = new JTextField();
        r_email_text.setBounds(150, 645, 500, 50);
        r_email_text.setFont(BigFontTR_3);
        panel.add(r_email_text);

        //Age
        JLabel r_age = new JLabel("Дата народження:");
        r_age.setFont(BigFontTR_3);
        r_age.setBounds(150, 50, 800, 80);
        panel.add(r_age);

        r_age_year = new JComboBox(mas_yers);
        r_age_year.setBounds(150, 135, 200, 50);
        r_age_year.setFont(BigFontTR_3);
        panel.add(r_age_year);


        r_age_mounts = new JComboBox(mas_mounts);
        r_age_mounts.setBounds(400, 135, 100, 50);
        r_age_mounts.setFont(BigFontTR_3);
        panel.add(r_age_mounts);

        r_age_day = new JComboBox(mas_days);
        r_age_day.setBounds(550, 135, 100, 50);
        r_age_day.setFont(BigFontTR_3);
        panel.add(r_age_day);

        //Grow
        JLabel r_grow = new JLabel("Ваш ріст(см):");
        r_grow.setFont(BigFontTR_3);
        r_grow.setBounds(150, 220, 500, 80);
        panel.add(r_grow);

        r_grow_text = new JComboBox(parametrs);
        r_grow_text.setBounds(150, 305, 500, 50);
        r_grow_text.setFont(BigFontTR_3);
        panel.add(r_grow_text);

        //Weight
        JLabel r_weight = new JLabel("Ваша вага(кг):");
        r_weight.setFont(BigFontTR_3);
        r_weight.setBounds(150, 390, 500, 80);
        panel.add(r_weight);

        r_weight_text = new JComboBox(parametrs);
        r_weight_text.setBounds(150, 475, 500, 50);
        r_weight_text.setFont(BigFontTR_3);
        panel.add(r_weight_text);


//Button for sing in
        JButton r_next = new JButton("Далі");
        r_next.setBounds(400, 800, 200, 100);
        r_next.setBackground(color_4);
        r_next.setForeground(color_2);
        r_next.setFont(BigFontTR_2);
        panel.add(r_next);

        JButton r_back = new JButton("Назад");
        r_back.setBounds(100, 800, 200, 100);
        r_back.setBackground(color_4);
        r_back.setForeground(color_2);
        r_back.setFont(BigFontTR_2);
        panel.add(r_back);


        r_end.setBounds(400, 800, 300, 100);
        r_end.setBackground(color_4);
        r_end.setForeground(color_2);
        r_end.setFont(BigFontTR_2);
        panel.add(r_end);

        JLabel img_singin = new JLabel(image_6);
        img_singin.setBounds(810, 0, 1200, 1000);
        panel.add(img_singin);





        r_age.setVisible(false);
        r_age_year.setVisible(false);
        r_age_mounts.setVisible(false);
        r_age_day.setVisible(false);
        r_grow.setVisible(false);
        r_grow_text.setVisible(false);
        r_weight.setVisible(false);
        r_weight_text.setVisible(false);
        r_back.setVisible(false);
        r_end.setVisible(false);





//


        r_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r_name.setVisible(false);
                r_name_text.setVisible(false);
                r_surname.setVisible(false);
                r_surname_text.setVisible(false);
                r_number.setVisible(false);
                r_number_text.setVisible(false);
                r_email.setVisible(false);
                r_email_text.setVisible(false);
                r_next.setVisible(false);
                r_age.setVisible(true);
                r_age_year.setVisible(true);
                r_age_mounts.setVisible(true);
                r_age_day.setVisible(true);
                r_grow.setVisible(true);
                r_grow_text.setVisible(true);
                r_weight.setVisible(true);
                r_weight_text.setVisible(true);
                r_back.setVisible(true);
                r_end.setVisible(true);
//
            }
        });

        r_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r_name.setVisible(true);
                r_name_text.setVisible(true);
                r_surname.setVisible(true);
                r_surname_text.setVisible(true);
                r_number.setVisible(true);
                r_number_text.setVisible(true);
                r_email.setVisible(true);
                r_email_text.setVisible(true);
                r_next.setVisible(true);
                r_age.setVisible(false);
                r_age_year.setVisible(false);
                r_age_mounts.setVisible(false);
                r_age_day.setVisible(false);
                r_grow.setVisible(false);
                r_grow_text.setVisible(false);
                r_weight.setVisible(false);
                r_weight_text.setVisible(false);
                r_back.setVisible(false);
                r_end.setVisible(false);
//
            }
        });

        r_end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("graf1");
                r_name.setVisible(false);
                r_name_text.setVisible(false);
                r_surname.setVisible(false);
                r_surname_text.setVisible(false);
                r_number.setVisible(false);
                r_number_text.setVisible(false);
                r_email.setVisible(false);
                r_email_text.setVisible(false);
                img_singin.setVisible(false);
                r_next.setVisible(false);
                r_age.setVisible(false);
                r_age_year.setVisible(false);
                r_age_mounts.setVisible(false);
                r_age_day.setVisible(false);
                r_grow.setVisible(false);
                r_grow_text.setVisible(false);
                r_weight.setVisible(false);
                r_weight_text.setVisible(false);
                r_back.setVisible(false);
                r_end.setVisible(false);
                img_autentification.setVisible(false);
               img_singin.setVisible(false);

                String name = null;
                String surname = null;
                int number = 876;
                String email = null;
                int year = 0;
                int mount = 0;
                int day = 0;
                int grow = 0;
                int weight = 0;
                name = String.valueOf(r_name_text.getText());
                surname = String.valueOf(r_surname_text.getText());
                number = Integer.valueOf((String)r_number_text.getText());
                email = String.valueOf(r_email_text.getText());
                year = (int) r_age_year.getSelectedItem();
                mount = (int) r_age_mounts.getSelectedItem();
                day = (int) r_age_day.getSelectedItem();
                weight = (int) r_weight_text.getSelectedItem();
                grow = (int) r_grow_text.getSelectedItem();


                try {
                    check_registration_end(name,surname,number,email,year,mount,day,grow,weight, us_id);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                System.out.println("graf2");




//
            }
        });



        return panel;
    }

    public void registr(int u_id){

            String name = null;
            String surname = null;
            int number = 876;
            String email = null;
            int year = 0;
            int mount = 0;
            int day = 0;
            int grow = 0;
            int weight = 0;
            name = String.valueOf(r_name_text.getText());
            surname = String.valueOf(r_surname_text.getText());
            number = Integer.valueOf((String)r_number_text.getText());
            email = String.valueOf(r_email_text.getText());
            year = (int) r_age_year.getSelectedItem();
            mount = (int) r_age_mounts.getSelectedItem();
            day = (int) r_age_day.getSelectedItem();
            grow = (int) r_grow_text.getSelectedItem();
            weight = (int) r_weight_text.getSelectedItem();
            System.out.println("weight - " + weight);
            try {
                check_registration_end(name,surname,number,email,year,mount,day,grow,weight, u_id);
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        }



    public void check_registration_end(String name,String surname,int number,String email,Integer year,Integer mount,Integer day,int grow,int weight, int us_id)throws SQLException, ClassNotFoundException{

        controler_user.registration_data(name,surname,number,email,year,mount,day,grow,weight, us_id);
    }

}
