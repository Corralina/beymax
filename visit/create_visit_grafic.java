package visit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class create_visit_grafic {
    controler_visit control = new controler_visit();

    public Integer [] mas_yers = {
            2031,2030,2029,2028,2027,2026,2025,2024,2023,2022,2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010,
            2009,2008,2007,2006,2005,2004,2003,2002,2001,2000
    };
    public Integer [] mas_mounts ={
            1,2,3,4,5,6,7,8,9,10,11,12
    };
    public Integer [] mas_days = {
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
    };
    public Integer [] mas_hours = {
            0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23
    };
    public Integer [] mas_minutes = {
            0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59
    };
    public String [] mas_clinicks;
    public String [] mas_doctors;
    public String addres = "";
    public String classification;
    public JComboBox year = new JComboBox(mas_yers);
    public JComboBox mounts = new JComboBox(mas_mounts);
    JComboBox day = new JComboBox(mas_days);
    public JComboBox hour = new JComboBox(mas_hours);
    JComboBox minuttes = new JComboBox(mas_minutes);
    JComboBox second = new JComboBox(mas_minutes);
    public JTextField comment = new JTextField("comment");
    public JComboBox clinick;
    public JComboBox doctor;

    public JPanel create_visit_grafic(int user_id){
        try {
            funki(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Font BigFontTR = new Font("Comic Sans MS", Font.BOLD, 100);
        Font BigFontTR_1 = new Font("Comic Sans MS", Font.BOLD, 70);
        Font BigFontTR_2 = new Font("Comic Sans MS", Font.BOLD, 50);
        Font BigFontTR_3 = new Font("Comic Sans MS", Font.BOLD, 40);
        Font BigFontTR_4 = new Font("Comic Sans MS", Font.BOLD, 30);
        Font BigFontTR_5 = new Font("Comic Sans MS", Font.BOLD, 25);
        Font BigFontTR_6 = new Font("Comic Sans MS", Font.BOLD, 15);

        Color color_1 = new Color(210, 190, 181);
        Color color_2 = new Color(125, 1, 1);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1100,1050);

        JLabel age = new JLabel("Дата візиту:");
        age.setFont(BigFontTR_3);
        age.setBounds(50, 50, 400, 80);
        panel.add(age);


        year.setBounds(50, 135, 130, 50);
        year.setFont(BigFontTR_3);
        year.setSelectedItem(2019);
        panel.add(year);

        mounts.setBounds(200, 135, 100, 50);
        mounts.setFont(BigFontTR_3);
        panel.add(mounts);


        day.setBounds(320, 135, 100, 50);
        day.setFont(BigFontTR_3);
        panel.add(day);

        JLabel times = new JLabel("Час візиту:");
        times.setFont(BigFontTR_3);
        times.setBounds(500, 50, 400, 80);
        panel.add(times);

        hour.setBounds(500,135, 100, 50);
        hour.setFont(BigFontTR_3);
        panel.add(hour);


        minuttes.setBounds(650, 135, 100, 50);
        minuttes.setFont(BigFontTR_3);
        panel.add(minuttes);


        second.setBounds(800, 135, 100, 50);
        second.setFont(BigFontTR_3);
        panel.add(second);

        JLabel t_1 = new JLabel(":");
        t_1.setBounds(625,135, 10,50);
        t_1.setFont(BigFontTR_6);
        panel.add(t_1);

        JLabel t_2 = new JLabel(":");
        t_2.setBounds(775,135, 10,50);
        t_2.setFont(BigFontTR_6);
        panel.add(t_2);

        //clinick
        JLabel clinick_lable = new JLabel("Лікарня:");
        clinick_lable.setFont(BigFontTR_3);
        clinick_lable.setBounds(50, 200, 800, 70);
        panel.add(clinick_lable);

        clinick = new JComboBox(mas_clinicks);
        clinick.setBounds(50,300, 600,50);
        clinick.setFont(BigFontTR_3);
        panel.add(clinick);

        JLabel doctor_lable = new JLabel("Лікар:");
        doctor_lable.setFont(BigFontTR_3);
        doctor_lable.setBounds(50, 400, 550, 70);
        panel.add(doctor_lable);

        doctor = new JComboBox(mas_doctors);
        doctor.setBounds(50,500, 600,50);
        doctor.setFont(BigFontTR_3);
        panel.add(doctor);


        comment.setBounds(50,600,600,50);
        comment.setFont(BigFontTR_3);
        comment.setForeground(Color.GRAY);
        panel.add(comment);




        //information about clinic and doctor
        JLabel inf_lable_clinic = new JLabel("АДРЕСА:");
        inf_lable_clinic.setBounds(700,250,400,100);
        inf_lable_clinic.setFont(BigFontTR_3);
        inf_lable_clinic.setForeground(Color.GRAY);
        panel.add(inf_lable_clinic);

        JTextField information_clinic = new JTextField();
        information_clinic.setBounds(700,350,400,150);
        information_clinic.setFont(BigFontTR_5);
        panel.add(information_clinic);

        JLabel inf_lable_doctor = new JLabel("ЛІКАР:");
        inf_lable_doctor.setBounds(700,550,400,100);
        inf_lable_doctor.setFont(BigFontTR_3);
        inf_lable_doctor.setForeground(Color.GRAY);
        panel.add(inf_lable_doctor);

        JTextField information_doctor = new JTextField();
        information_doctor.setBounds(700,650,400,150);
        information_doctor.setFont(BigFontTR_5);
        panel.add(information_doctor);

        inf_lable_clinic.setVisible(false);
        inf_lable_doctor.setVisible(false);
        information_clinic.setVisible(false);
        information_doctor.setVisible(false);




        comment.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                comment.setText(null);
                comment.setForeground(Color.BLACK);

            }
        });
        clinick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    funki_d((String)clinick.getSelectedItem());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                int qw = doctor.getItemCount();
                for(int i = 0; qw > i; i++){
                    doctor.removeItemAt(0);
                }
                for (int i = 0; i < mas_doctors.length; i++){
                    doctor.addItem(mas_doctors[i]);
                }
                if((int)clinick.getSelectedIndex() != 0){
                    inf_lable_clinic.setVisible(true);
                    information_clinic.setVisible(true);
                    information_clinic.setText(addres);
                }else{
                    inf_lable_clinic.setVisible(false);
                    inf_lable_doctor.setVisible(false);
                    information_clinic.setVisible(false);
                    information_doctor.setVisible(false);
                }




            }
        });

        doctor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    funki_d_a((String)doctor.getSelectedItem());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                if((int)doctor.getSelectedIndex() == 0){
                    inf_lable_doctor.setVisible(false);
                    information_doctor.setVisible(false);
                }else{
                    inf_lable_doctor.setVisible(true);
                    information_doctor.setVisible(true);
                    information_doctor.setText(classification);
                }




            }
        });



        return panel;
    }

    public void save_graf(int user_id){
        int year_d = (int)year.getSelectedItem();
        int mount_d = (int)mounts.getSelectedItem();
        int day_d = (int)day.getSelectedItem();
        int hour_d = (int)hour.getSelectedItem();
        int minute_d = (int)minuttes.getSelectedItem();
        int second_d = (int)second.getSelectedItem();
        String clinick_d = (String)clinick.getSelectedItem();
        String doctor_d = (String)doctor.getSelectedItem();
        String comment_d = String.valueOf(comment.getText());
        try {
            new_visit_data(year_d, mount_d, day_d, hour_d, minute_d, second_d, clinick_d, doctor_d, comment_d, user_id);
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    public void funki(String fs) throws SQLException, ClassNotFoundException {
        mas_clinicks = control.clinick_list(fs);
        mas_doctors = control.docotr_list(fs);
    }
    public void funki_d(String fs)throws SQLException, ClassNotFoundException{
        mas_doctors = control.docotr_list(fs);
        if(fs != null){
            addres = control.show_adress(fs);
        }
    }
    public void new_visit_data(int year, int mount,int day, int hour, int minute, int second, String clinic, String doctor, String comment, int user_id)throws SQLException, ClassNotFoundException{
        control.new_visit_data(year, mount, day, hour, minute, second, clinic, doctor, comment, user_id);
    }
    public void funki_d_a(String fs)throws SQLException, ClassNotFoundException{
        if(fs != null){
            classification = control.show_classification(fs);


        }
    }


}
