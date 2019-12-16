package desiase;

import javax.swing.*;
import java.awt.*;

public class show_all_desiase {
    public JPanel newJPanel(String[] mas_data, String[] mas_name, String[] mas_id){
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
        panel.setBounds(30, 100, 1150, 800);



        JTextArea textField = new JTextArea();
        textField.setEditable(false);

        JScrollPane scroll = new JScrollPane(textField);

        JButton show[] = new JButton[mas_id.length];
        JLabel data[] = new JLabel[mas_id.length];
        JLabel name[] = new JLabel[mas_id.length];
        JButton edit[] = new JButton[mas_id.length];
        JButton delete[] = new JButton[mas_id.length];
        int y = 10;
        int x_show = 0;
        int x_data = 50;
        int x_time = 200;
        int x_clinic = 320;
        int x_doctor = 500;
        int x_edit = 850;
        int x_delete = 980;
        for(int i = 0; i < mas_id.length; i++){
            show[i] = new JButton("s");
            data[i] = new JLabel(mas_data[i]);
            name[i] = new JLabel(mas_name[i]);
            edit[i] = new JButton("edit");
            delete[i] = new JButton("del");
            show[i].setBounds(x_show,y,40,40);
            data[i].setBounds(x_data,y,130,40);
            name[i].setBounds(x_doctor,y,400, 40);
            edit[i].setBounds(x_edit,y,100,40);
            delete[i].setBounds(x_delete,y,100,40);
            data[i].setFont(BigFontTR_6);
            name[i].setFont(BigFontTR_6);
            edit[i].setFont(BigFontTR_6);
            delete[i].setFont(BigFontTR_6);
            delete[i].setName(""+i);
            String n_i = delete[i].getName();
            textField.add(show[i]);
            textField.add(data[i]);
            textField.add(name[i]);
            textField.add(edit[i]);
            textField.add(delete[i]);
            y += 50;

//            delete[i].addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    try {
//                        delete(Integer.parseInt(mas_id[Integer.parseInt(n_i)]));
//                    } catch (SQLException e1) {
//                        e1.printStackTrace();
//                    } catch (ClassNotFoundException e1) {
//                        e1.printStackTrace();
//                    }
//
//
//                }
//            });

        }


        scroll.setBounds(0, 0, 1100, 800);

        panel.add(scroll);





        return panel;
    }
}
