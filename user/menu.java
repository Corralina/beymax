package user;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class menu {
    private controler_user controler_user = new controler_user();
    public JButton exit = new JButton("Вихід");
    public JButton setting = new JButton("Редагувати");
    public JButton deceases = new JButton("Хвороби");
    public JButton visits = new JButton("Візити");
    public String data_name = "";
    public String data_surname = "";
    public String data_age = "";
    public String data_grow = "";
    public String data_weight = "";
    public user user;

    public JPanel newJPanel( int user_id){

        try {
            fence(user_id);
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

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(1250,0,700,1050);

        JLabel name = new JLabel("ім'я:");
        name.setFont(BigFontTR_3);
        name.setBounds(50, 50, 300, 80);
        panel.add(name);

        JLabel surname = new JLabel("прізвище:");
        surname.setFont(BigFontTR_3);
        surname.setBounds(50, 150, 300, 80);
        panel.add(surname);

        JLabel age = new JLabel("вік:");
        age.setFont(BigFontTR_3);
        age.setBounds(50, 250, 300, 80);
        panel.add(age);

        JLabel grow = new JLabel("ріст:");
        grow.setFont(BigFontTR_3);
        grow.setBounds(50, 350, 300, 80);
        panel.add(grow);

        JLabel weight = new JLabel("вага:");
        weight.setFont(BigFontTR_3);
        weight.setBounds(50, 450, 300, 80);
        panel.add(weight);

        JLabel name_user = new JLabel(data_name);
        name_user.setFont(BigFontTR_3);
        name_user.setBounds(350, 50, 500, 80);
        panel.add(name_user);

        JLabel surname_user = new JLabel(data_surname);
        surname_user.setFont(BigFontTR_3);
        surname_user.setBounds(350, 150, 500, 80);
        panel.add(surname_user);

        JLabel age_user = new JLabel(data_age);
        age_user.setFont(BigFontTR_3);
        age_user.setBounds(350, 250, 500, 80);
        panel.add(age_user);

        JLabel grow_user = new JLabel(data_grow);
        grow_user.setFont(BigFontTR_3);
        grow_user.setBounds(350, 350, 500, 80);
        panel.add(grow_user);

        JLabel weight_user = new JLabel(data_weight);
        weight_user.setFont(BigFontTR_3);
        weight_user.setBounds(350, 450, 500, 80);
        panel.add(weight_user);


        visits.setBounds(50, 600, 250, 100);
        visits.setBackground(color_4);
        visits.setForeground(color_2);
        visits.setFont(BigFontTR_3);
        panel.add(visits);


        deceases.setBounds(350, 600, 250, 100);
        deceases.setBackground(color_4);
        deceases.setForeground(color_2);
        deceases.setFont(BigFontTR_3);
//        panel.add(deceases);


        setting.setBounds(50, 800, 250, 100);
        setting.setBackground(color_4);
        setting.setForeground(color_2);
        setting.setFont(BigFontTR_3);
        panel.add(setting);


        exit.setBounds(350, 800, 250, 100);
        exit.setBackground(color_4);
        exit.setForeground(color_2);
        exit.setFont(BigFontTR_3);
        panel.add(exit);




        return panel;
    }

    public void fence(int user_id)throws SQLException, ClassNotFoundException{
        user = controler_user.menu_data_user(user_id);
        data_name = user.getName_u();
        data_surname = user.getSurname_u();
        data_age = user.getAge_u_2();
        data_grow = String.valueOf(user.getGrow_u());
        data_weight = String.valueOf(user.getWeight_u());
        String r = String.valueOf(data_age);
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
        data_age = String.valueOf(f);
    }
}
