package desiase;

import javax.swing.*;
import java.awt.*;

public class desiase_grafic {
    show_all_desiase show_all = new show_all_desiase();
    public JPanel all_desiase;
    public String[] mas_data;
    public String[] mas_name;
    public String[] mas_id;
    public JPanel newJPanel(){
        Font BigFontTR = new Font("Comic Sans MS", Font.BOLD, 100);
        Font BigFontTR_1 = new Font("Comic Sans MS", Font.BOLD, 70);
        Font BigFontTR_2 = new Font("Comic Sans MS", Font.BOLD, 50);
        Font BigFontTR_3 = new Font("Comic Sans MS", Font.BOLD, 40);
        Font BigFontTR_4 = new Font("Comic Sans MS", Font.BOLD, 30);
        Font BigFontTR_5 = new Font("Comic Sans MS", Font.BOLD, 25);
        Font BigFontTR_6 = new Font("Comic Sans MS", Font.BOLD, 20);

        Color color_1 = new Color(210, 190, 181);
        Color color_2 = new Color(125, 1, 1);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1250,1050);



        JButton create = new JButton("+");
        create.setBounds(30,20,50,50);
        create.setFont(BigFontTR_5);
        create.setBackground(color_2);
        create.setForeground(color_1);
        panel.add(create);

        return panel;
    }
}
