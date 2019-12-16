package visit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class show_all_visits_grafic {
    edit_visit edit_clas = new edit_visit();
    controler_visit control = new controler_visit();

    public String show_one;
    JPanel edit_panel;

    public JPanel newJPanel(String[] mas_data,String[] mas_time, String[] mas_clinick, String[] mas_doctor, String[] mas_id){
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
        JLabel time[] = new JLabel[mas_id.length];
        JLabel clinic[] = new JLabel[mas_id.length];
        JLabel doctor[] = new JLabel[mas_id.length];
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
            System.out.println(mas_id[i]);
            show[i] = new JButton("s");
            data[i] = new JLabel(mas_data[i]);
            time[i] = new JLabel(mas_time[i]);
            clinic[i] = new JLabel(mas_clinick[i]);
            doctor[i] = new JLabel(mas_doctor[i]);
            edit[i] = new JButton("edit");
            delete[i] = new JButton("del");
            show[i].setBounds(x_show,y,40,40);
            data[i].setBounds(x_data,y,130,40);
            time[i].setBounds(x_time,y,130,40);
            clinic[i].setBounds(x_clinic,y,200,40);
            doctor[i].setBounds(x_doctor,y,400, 40);
            edit[i].setBounds(x_edit,y,100,40);
            delete[i].setBounds(x_delete,y,100,40);
            data[i].setFont(BigFontTR_6);
            time[i].setFont(BigFontTR_6);
            clinic[i].setFont(BigFontTR_6);
            doctor[i].setFont(BigFontTR_6);
            edit[i].setFont(BigFontTR_6);
            delete[i].setFont(BigFontTR_6);
            delete[i].setName(""+i);
            String n_i = delete[i].getName();
            textField.add(show[i]);
            textField.add(data[i]);
            textField.add(time[i]);
            textField.add(clinic[i]);
            textField.add(doctor[i]);
            textField.add(edit[i]);
            textField.add(delete[i]);
            y += 50;

            delete[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        delete(Integer.parseInt(mas_id[Integer.parseInt(n_i)]));
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }


                }
            });

            show[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        show_one_visit(Integer.parseInt(mas_id[Integer.parseInt(n_i)]));
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            show_one,
                            "Visit",
                            JOptionPane.PLAIN_MESSAGE);

                }
            });

            edit[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    edit_panel = edit_clas.newJPanel(Integer.parseInt(mas_id[Integer.parseInt(n_i)]));
                    scroll.setVisible(false);
                    textField.setVisible(false);
                    panel.add(edit_panel);
                    panel.repaint();
                }
            });

        }

        edit_clas.save_edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(edit_panel);
                panel.repaint();
            }
        });


        scroll.setBounds(0, 0, 1100, 800);

        panel.add(scroll);





        return panel;
    }



    public void delete(int id)throws SQLException, ClassNotFoundException{
        control.delete_visit(id);
    }

    public void show_one_visit(int visit_id)throws SQLException, ClassNotFoundException{
        show_one = control.one_visit(visit_id);
    }
}
