package visit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class visit_grafic {
    create_visit_grafic create_visit_grafic = new create_visit_grafic();
    show_all_visits_grafic show_all_visits_grafic = new show_all_visits_grafic();
    controler_visit control = new controler_visit();
    JPanel panel;
    JPanel create_visit;
    public JButton create_visit_button = new JButton("Зберегти");


    public JButton back_v = new JButton("b");
    public JButton rev_v = new JButton("r");

    public JPanel all_visit;
    public String[] mas_data;
    public String[] mas_time;
    public String[] mas_clinick;
    public String[] mas_doctor;
    public String[] mas_id;
    public String[] mas_all_doctor;
    public String[] mas_all_clinic;
    public int search_type = 0;
    public String[] mas_list_search={
            "лікар","лікарня","дата"
    };
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

    public JPanel newJPanel(int user_id){
        try {
            show_all(user_id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            search_start();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
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

        ImageIcon image_1 = new ImageIcon("D:\\stady\\pictures\\359.jpg");

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1250,1050);

        JLabel img_search = new JLabel(image_1);
        img_search.setBounds(30, 100, 1150, 800);
        panel.add(img_search);

        show_v();

        create_visit = create_visit_grafic.create_visit_grafic(user_id);



        JButton create = new JButton("+");
        create.setBounds(30,20,50,50);
        create.setFont(BigFontTR_5);
        create.setBackground(color_2);
        create.setForeground(color_1);
        panel.add(create);


        back_v.setBounds(100,20,50,50);
        back_v.setFont(BigFontTR_6);
        back_v.setBackground(color_2);
        back_v.setForeground(color_1);
        panel.add(back_v);

        rev_v.setBounds(950,20,50,50);
        rev_v.setFont(BigFontTR_6);
        rev_v.setBackground(color_2);
        rev_v.setForeground(color_1);
        panel.add(rev_v);

        create_visit_button.setBounds(250,730,150,50);
        create_visit_button.setFont(BigFontTR_6);
        create_visit_button.setBackground(color_1);
        create_visit_button.setForeground(color_2);
        panel.add(create_visit_button);


        //search visit
        JButton search = new JButton("S");
        search.setBounds(170,20,50,50);
        search.setFont(BigFontTR_6);
        search.setBackground(color_2);
        search.setForeground(color_1);
        panel.add(search);

        JComboBox search_list = new JComboBox(mas_list_search);
        search_list.setBounds(170,20, 100,50);
        search_list.setFont(BigFontTR_5);
        panel.add(search_list);

        JComboBox search_clinick = new JComboBox(mas_all_clinic);
        search_clinick.setBounds(320,20, 300,50);
        search_clinick.setFont(BigFontTR_5);
        panel.add(search_clinick);

        JComboBox search_doctor = new JComboBox(mas_all_doctor);
        search_doctor.setBounds(320,20, 300,50);
        search_doctor.setFont(BigFontTR_5);
        panel.add(search_doctor);

        JComboBox search_data_year = new JComboBox(mas_yers);
        search_data_year.setBounds(320,20, 80,50);
        search_data_year.setFont(BigFontTR_5);
        panel.add(search_data_year);

        JComboBox search_data_mount = new JComboBox(mas_mounts);
        search_data_mount.setBounds(435,20, 80,50);
        search_data_mount.setFont(BigFontTR_5);
        panel.add(search_data_mount);

        JComboBox search_data_day = new JComboBox(mas_days);
        search_data_day.setBounds(540,20, 80,50);
        search_data_day.setFont(BigFontTR_5);
        panel.add(search_data_day);

        JButton serch_go = new JButton("go");
        serch_go.setBounds(670,20,50,50);
        serch_go.setFont(BigFontTR_5);
        serch_go.setBackground(color_2);
        serch_go.setForeground(color_1);
        panel.add(serch_go);

        search_list.setVisible(false);
        search_clinick.setVisible(false);
        search_doctor.setVisible(false);
        search_data_day.setVisible(false);
        search_data_mount.setVisible(false);
        search_data_year.setVisible(false);
        serch_go.setVisible(false);
        back_v.setVisible(false);
        img_search.setVisible(false);






        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search.setVisible(false);
                back_v.setVisible(true);
                panel.remove(all_visit);
                panel.repaint();
                panel.add(create_visit);
                panel.repaint();
                create.setVisible(false);

            }
        });

//        create_visit_grafic.create_visit_button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                search.setVisible(true);
//                back_v.setVisible(false);
//                create.setVisible(true);
//                try {
//                    show_all(user_id);
//                } catch (SQLException e1) {
//                    e1.printStackTrace();
//                } catch (ClassNotFoundException e1) {
//                    e1.printStackTrace();
//                }
//                create.setVisible(true);
//
//                panel.remove(create_visit);
//                panel.repaint();
//                show_v();
//            }
//        });

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                img_search.setVisible(true);
                back_v.setVisible(true);
                search.setVisible(false);
                search_list.setVisible(true);
                search_type = 0;
                search_doctor.setVisible(true);
                serch_go.setVisible(true);
                panel.remove(all_visit);
                panel.repaint();

            }
        });

//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                img_search.setVisible(false);
//                back.setVisible(false);
//                search_list.setVisible(false);
//                search_clinick.setVisible(false);
//                search_doctor.setVisible(false);
//                search_data_day.setVisible(false);
//                search_data_mount.setVisible(false);
//                search_data_year.setVisible(false);
//                serch_go.setVisible(false);
//                search.setVisible(true);
//                create.setVisible(true);
//                try {
//                    show_all(user_id);
//                } catch (SQLException e1) {
//                    e1.printStackTrace();
//                } catch (ClassNotFoundException e1) {
//                    e1.printStackTrace();
//                }
//                panel.remove(create_visit);
//                panel.repaint();
//                show_v();
//            }
//        });


        search_list.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search_type = search_list.getSelectedIndex();
                if(search_type == 0){
                    search_doctor.setVisible(true);
                    search_clinick.setVisible(false);
                    search_data_day.setVisible(false);
                    search_data_mount.setVisible(false);
                    search_data_year.setVisible(false);
                }else if(search_type == 1){
                    search_clinick.setVisible(true);
                    search_doctor.setVisible(false);
                    search_data_day.setVisible(false);
                    search_data_mount.setVisible(false);
                    search_data_year.setVisible(false);
                }else {
                    search_data_day.setVisible(true);
                    search_data_mount.setVisible(true);
                    search_data_year.setVisible(true);
                    search_clinick.setVisible(false);
                    search_doctor.setVisible(false);

                }

            }
        });

        serch_go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                img_search.setVisible(false);
                back_v.setVisible(true);
                search_list.setVisible(false);
                search_clinick.setVisible(false);
                search_doctor.setVisible(false);
                search_data_day.setVisible(false);
                search_data_mount.setVisible(false);
                search_data_year.setVisible(false);
                serch_go.setVisible(false);
                search.setVisible(true);
                String text = null;
                if(search_type == 0){
                    text = (String)search_doctor.getSelectedItem();
                }else if(search_type == 1){
                    text = (String)search_clinick.getSelectedItem();
                }else{
                    text = String.valueOf((int)search_data_year.getSelectedItem() + "-" + (int)search_data_mount.getSelectedItem() + "-" + (int)search_data_day.getSelectedItem());
                }
                try {
                    search_stop(text, search_type, user_id);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                JPanel show_search = new show_all_visits_grafic().newJPanel(mas_data, mas_time, mas_clinick, mas_doctor, mas_id);
                panel.add(show_search);
                panel.repaint();
//                back.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        back.setVisible(false);
//                        panel.remove(show_search);
//                        panel.repaint();
//                        try {
//                            show_all(user_id);
//                        } catch (SQLException e1) {
//                            e1.printStackTrace();
//                        } catch (ClassNotFoundException e1) {
//                            e1.printStackTrace();
//                        }
//                        panel.add(all_visit);
//                    }
//                });
                search.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        search.setVisible(false);
                        search_list.setVisible(true);
                        search_type = 0;
                        search_doctor.setVisible(true);
                        serch_go.setVisible(true);
                        panel.remove(show_search);
                        panel.repaint();

                    }
                });



            }
        });

        return panel;
    }

    public void s_b(int user_id){
        create_visit_grafic.save_graf(user_id);
    }

    public void show_v(){
        all_visit = show_all_visits_grafic.newJPanel(mas_data, mas_time, mas_clinick, mas_doctor, mas_id);
        panel.add(all_visit);
        panel.repaint();
    }

    public void show_all(int user_id)throws SQLException, ClassNotFoundException{
        String[][] all = control.show_all_visit(user_id);
        int z = all[0].length;
        System.out.println(z);
        mas_data = all[0];
        mas_time = all[1];
        mas_clinick = all[2];
        mas_doctor = all[3];
        mas_id = all[4];

    }

    public void search_start()throws SQLException, ClassNotFoundException{
        mas_all_clinic = control.clinick_list(null);
        mas_all_doctor = control.docotr_list(null);
    }
    public void search_stop(String text, int num, int user_id)throws SQLException, ClassNotFoundException{
        String[][] all;
        if(num == 0){
            all  = control.search_doctor(text, user_id);
        }else if(num == 1){
            all  = control.search_clinic(text, user_id);
        }else{
            all  = control.search_date(text, user_id);
        }
        int z = all[0].length;
        System.out.println(z);
        mas_data = all[0];
        mas_time = all[1];
        mas_clinick = all[2];
        mas_doctor = all[3];
        mas_id = all[4];
    }
}
