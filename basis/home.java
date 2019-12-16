package basis;


import javax.swing.*;
import java.awt.*;

public class home {
    public JButton start = new JButton("Старт");
    public JPanel newJPanel(){

        Font BigFontTR = new Font("Comic Sans MS", Font.BOLD, 130);
        Font BigFontTR_1 = new Font("Comic Sans MS", Font.BOLD, 70);
        Font BigFontTR_2 = new Font("Comic Sans MS", Font.BOLD, 50);
        Font BigFontTR_3 = new Font("Comic Sans MS", Font.BOLD, 40);
        Font BigFontTR_4 = new Font("Comic Sans MS", Font.BOLD, 30);
        Font BigFontTR_5 = new Font("Comic Sans MS", Font.BOLD, 20);

        Color color_1 = new Color(210, 190, 181);
        Color color_2 = new Color(125, 1, 1);
        Color color_4 = new Color(210, 190, 181);

        ImageIcon image_1 = new ImageIcon("D:\\stady\\pictures\\baymax.png");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1900,1050);

        JLabel img_fon = new JLabel(image_1);
        img_fon.setBounds(810, 0, 1200, 1000);
        panel.add(img_fon);

        JLabel l_1 = new JLabel("Привіт");
        l_1.setBounds(380, 40, 500, 200);
        l_1.setFont(BigFontTR);
        l_1.setForeground(color_2);
        panel.add(l_1);

        JLabel l_2 = new JLabel("Мене звати Беймакс");
        l_2.setBounds(200, 250, 700, 100);
        l_2.setFont(BigFontTR_2);
        l_2.setForeground(color_2);
        panel.add(l_2);

        JLabel l_3 = new JLabel("твій особистий помічник!");
        l_3.setBounds(140, 350, 700, 100);
        l_3.setFont(BigFontTR_2);
        l_3.setForeground(color_2);
        panel.add(l_3);

        JLabel l_4 = new JLabel("Я допоможу тобі");
        l_4.setBounds(250, 500, 700, 100);
        l_4.setFont(BigFontTR_2);
        l_4.setForeground(color_2);
        panel.add(l_4);

        JLabel l_5 = new JLabel("слідкувати за здоров'ям");
        l_5.setBounds(150, 650, 700, 100);
        l_5.setFont(BigFontTR_2);
        l_5.setForeground(color_2);
        panel.add(l_5);


        start.setBounds(500, 800, 200, 100);
        start.setBackground(color_4);
        start.setForeground(color_2);
        start.setFont(BigFontTR_2);
        panel.add(start);



        return panel;
    }
}

