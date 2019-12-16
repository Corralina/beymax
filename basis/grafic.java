package basis;

import desiase.desiase_grafic;
import user.alter_user;
import user.autentification;
import user.controler_user;
import user.menu;
import visit.visit_grafic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class grafic extends JFrame{
    public int user_id = 0;
    public JPanel panel;
    menu menu_class = new menu();
    home home_class = new home();
    autentification autentification_class = new autentification();
    visit_grafic visit_grafic = new visit_grafic();
    desiase_grafic desiase_grafic = new desiase_grafic();
    alter_user alter = new alter_user();

    public JPanel menu;
    public JPanel desiase = desiase_grafic.newJPanel();
    public JPanel visit;
    public JPanel home = home_class.newJPanel();
    public JPanel autentif;
    public JPanel alter_u;
    user.controler_user controler_user = new controler_user();
    public String login_1;
    public String password_1;
    public String login_2;
    public String password_2;
    public String password_2_2;
    public int registration_result = 0;
    public JButton log = new JButton("Ок");
    JButton strip_2 = new JButton();
    public JLabel img_autentification;
    public JButton edit_enter = new JButton("Enter enter");


    public grafic() {
        super("Desctop programm");
        this.setBounds(-10, 0, 1950, 1050);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

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

        panel = new JPanel();
        panel.setLayout(null);


        img_autentification = new JLabel(image_5);
        img_autentification.setBounds(810, 0, 1200, 1000);
        panel.add(img_autentification);

        JButton log_in = new JButton("Вхід");
        log_in.setBounds(100, 100, 300, 100);
        log_in.setFont(BigFontTR_2);
        log_in.setBackground(Color.CYAN);
        panel.add(log_in);
        JButton sing_in = new JButton("Реєстрація");
        sing_in.setBounds(425, 100, 300, 100);
        sing_in.setFont(BigFontTR_2);
        sing_in.setBackground(Color.LIGHT_GRAY);
        panel.add(sing_in);


        log.setBounds(150, 700, 525, 100);
        log.setBackground(Color.WHITE);
        log.setFont(BigFontTR_2);
        panel.add(log);
        JButton sing = new JButton("Ок");
        sing.setBounds(150, 700, 525, 100);
        sing.setBackground(Color.WHITE);
        sing.setFont(BigFontTR_2);
        panel.add(sing);

        edit_enter.setBounds(150, 600, 525, 100);
        edit_enter.setBackground(Color.WHITE);
        edit_enter.setFont(BigFontTR_2);
        panel.add(edit_enter);
        edit_enter.setVisible(false);

//Елементи входу
        //Login
        JLabel login_login = new JLabel("Введіть логін:");
        login_login.setFont(BigFontTR_2);
        login_login.setBounds(150, 250, 500, 100);
        panel.add(login_login);

        JTextField first_login = new JTextField("логін", 50);
        first_login.setFont(new Font("Dialog", Font.PLAIN, 30));
        first_login.setForeground(Color.LIGHT_GRAY);
        first_login.setBounds(150, 350, 500, 50);
        panel.add(first_login);

        JLabel password_login = new JLabel("Введіть пароль:");
        password_login.setFont(BigFontTR_2);
        password_login.setBounds(150, 400, 500, 100);
        panel.add(password_login);
        // Поле с паролем
        JPasswordField second_login = new JPasswordField("пароль", 20);
        second_login.setFont(new Font("Dialog", Font.PLAIN, 25));
        second_login.setForeground(Color.LIGHT_GRAY);
        second_login.setBounds(150, 500, 500, 50);
        panel.add(second_login);

        //Sing in
        JLabel login_singin = new JLabel("Створіть логін:");
        login_singin.setFont(BigFontTR_2);
        login_singin.setBounds(150, 230, 500, 100);
        panel.add(login_singin);

        JTextField login_singin_text = new JTextField("логін", 50);
        login_singin_text.setFont(new Font("Dialog", Font.PLAIN, 30));
        login_singin_text.setForeground(Color.LIGHT_GRAY);
        login_singin_text.setBounds(150, 330, 500, 50);
        panel.add(login_singin_text);

        JLabel password_singin = new JLabel("Вигадайте пароль:");
        password_singin.setFont(BigFontTR_2);
        password_singin.setBounds(150, 380, 500, 100);
        panel.add(password_singin);

        JPasswordField password_singin_pas = new JPasswordField("password", 20);
        password_singin_pas.setFont(new Font("Dialog", Font.PLAIN, 30));
        password_singin_pas.setForeground(Color.LIGHT_GRAY);
        password_singin_pas.setBounds(150, 480, 500, 50);
        panel.add(password_singin_pas);

        JLabel password_singin_2 = new JLabel("Повторіть пароль:");
        password_singin_2.setFont(BigFontTR_2);
        password_singin_2.setBounds(150, 530, 500, 100);
        panel.add(password_singin_2);
        // Поле с паролем
        JPasswordField password_singin_pas_2 = new JPasswordField("passwords", 20);
        password_singin_pas_2.setFont(new Font("Dialog", Font.PLAIN, 30));
        password_singin_pas_2.setForeground(Color.LIGHT_GRAY);
        password_singin_pas_2.setBounds(150, 630, 500, 50);
        panel.add(password_singin_pas_2);




        panel.add(home);


        //Чорна смужка, яка ділить екран на 2 частини
        JButton strip_1 = new JButton();
        strip_1.setBounds(1850, 0, 100, 1050);
        strip_1.setBackground(Color.BLACK);
        panel.add(strip_1);


        strip_2.setBounds(1250, 0, 10, 1050);
        strip_2.setBackground(Color.BLACK);
        panel.add(strip_2);




        log_in.setVisible(false);
        sing_in.setVisible(false);

        log.setVisible(false);
        login_login.setVisible(false);
        first_login.setVisible(false);
        password_login.setVisible(false);
        second_login.setVisible(false);

        sing.setVisible(false);
        login_singin.setVisible(false);
        login_singin_text.setVisible(false);
        password_singin.setVisible(false);
        password_singin_2.setVisible(false);
        password_singin_pas.setVisible(false);
        password_singin_pas_2.setVisible(false);
        img_autentification.setVisible(false);





        log_in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                log.setVisible(true);
                sing.setVisible(false);
                sing_in.setBackground(Color.LIGHT_GRAY);
                log_in.setBackground(Color.CYAN);
                login_login.setVisible(true);
                first_login.setVisible(true);
                password_login.setVisible(true);
                second_login.setVisible(true);
                login_singin.setVisible(false);
                password_singin.setVisible(false);
                login_singin_text.setVisible(false);
                password_singin_pas.setVisible(false);
                password_singin_2.setVisible(false);
                password_singin_pas_2.setVisible(false);
                first_login.setText("Your login");
                second_login.setText("password");
                first_login.setForeground(Color.LIGHT_GRAY);
                second_login.setForeground(Color.LIGHT_GRAY);


            }
        });

        sing_in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                log.setVisible(false);
                sing.setVisible(true);
                sing_in.setBackground(Color.CYAN);
                log_in.setBackground(Color.LIGHT_GRAY);
                login_login.setVisible(false);
                first_login.setVisible(false);
                password_login.setVisible(false);
                second_login.setVisible(false);
                login_singin.setVisible(true);
                password_singin.setVisible(true);
                login_singin_text.setVisible(true);
                password_singin_pas.setVisible(true);
                password_singin_2.setVisible(true);
                password_singin_pas_2.setVisible(true);
                login_singin_text.setText("New login");
                password_singin_pas.setText("password");
                password_singin_pas_2.setText("passwords");
                login_singin_text.setForeground(Color.LIGHT_GRAY);
                password_singin_pas.setForeground(Color.LIGHT_GRAY);
                password_singin_pas_2.setForeground(Color.LIGHT_GRAY);


            }
        });

        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login_1 = String.valueOf(first_login.getText());
                password_1 = String.valueOf(second_login.getPassword());
                try {
                    check_log_in(login_1, password_1);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                first_login.setText("логін");
                first_login.setForeground(Color.GRAY);
                second_login.setText("password");
                second_login.setForeground(Color.GRAY);
                if (user_id > 0){
                    m(user_id);
                    img_autentification.setVisible(false);
                    log_in.setVisible(false);
                    sing_in.setVisible(false);

                    log.setVisible(false);
                    login_login.setVisible(false);
                    first_login.setVisible(false);
                    password_login.setVisible(false);
                    second_login.setVisible(false);

                    sing.setVisible(false);
                    login_singin.setVisible(false);
                    login_singin_text.setVisible(false);
                    password_singin.setVisible(false);
                    password_singin_2.setVisible(false);
                    password_singin_pas.setVisible(false);
                    password_singin_pas_2.setVisible(false);
                    strip_2.setVisible(true);
                }


            }
        });

        sing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login_2 = String.valueOf(login_singin_text.getText());
                password_2 = String.valueOf(password_singin_pas.getPassword());
                password_2_2 = String.valueOf(password_singin_pas_2.getPassword());
                try {
                    check_sing_in(login_2, password_2, password_2_2);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                if (registration_result == 0) {
                    log_in.setVisible(false);//Login
                    sing_in.setVisible(false);//Singin
                    sing.setVisible(false);//Login enter
                    log.setVisible(false);//Singin enter
                    //Element login and singin
                    login_singin.setVisible(false);
                    password_singin.setVisible(false);
                    login_singin_text.setVisible(false);
                    password_singin_pas.setVisible(false);
                    password_singin_2.setVisible(false);
                    password_singin_pas_2.setVisible(false);
                    log.setVisible(false);
                    login_login.setVisible(false);
                    first_login.setVisible(false);
                    password_login.setVisible(false);
                    second_login.setVisible(false);
                    img_autentification.setVisible(false);

                    log_in.setVisible(false);
                    sing_in.setVisible(false);

                    log.setVisible(false);
                    login_login.setVisible(false);
                    first_login.setVisible(false);
                    password_login.setVisible(false);
                    second_login.setVisible(false);

                    sing.setVisible(false);
                    login_singin.setVisible(false);
                    login_singin_text.setVisible(false);
                    password_singin.setVisible(false);
                    password_singin_2.setVisible(false);
                    password_singin_pas.setVisible(false);
                    password_singin_pas_2.setVisible(false);
                    autentif = new autentification().newJPanel(user_id);
                    panel.add(autentif);
                    panel.repaint();



                } else {
                    if (registration_result == 1) {
                        login_singin_text.setText("логін111");

                    } else if (registration_result == 2) {
                        login_singin_text.setText("логін222");

                    }
//                    login_singin_text.setText("логін");
                    login_singin_text.setForeground(Color.GRAY);
                    password_singin_pas.setText("password");
                    password_singin_pas.setForeground(Color.GRAY);
                    password_singin_pas_2.setText("password");
                    password_singin_pas_2.setForeground(Color.GRAY);
                }



            }
            });


        menu_class.setting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(visit);
                panel.repaint();
                alter_u = new alter_user().newJPanel(user_id);
                panel.add(alter_u);
                panel.repaint();
                edit_enter.setVisible(true);


            }
        });

        edit_enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("start");
                try {
                    alter.edit_save(user_id);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                System.out.println("truuuuue");
                panel.remove(alter_u);
                panel.repaint();
                panel.remove(menu);
                panel.repaint();
                edit_enter.setVisible(false);
                m(user_id);



            }
        });



        first_login.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                first_login.setText(null);
                first_login.setForeground(Color.BLACK);

            }
        });

        second_login.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                second_login.setText(null);
                second_login.setForeground(Color.BLACK);

            }
        });


        login_singin_text.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                login_singin_text.setText(null);
                login_singin_text.setForeground(Color.BLACK);

            }
        });
        second_login.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                second_login.setText(null);
                second_login.setForeground(Color.BLACK);

            }
        });

        password_singin_pas.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                password_singin_pas.setText(null);
                password_singin_pas.setForeground(Color.BLACK);

            }
        });

        password_singin_pas_2.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent event){
                password_singin_pas_2.setText(null);
                password_singin_pas_2.setForeground(Color.BLACK);

            }
        });







        strip_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel.repaint();
                panel.add(menu);
                panel.repaint();
                strip_2.setVisible(true);
                strip_1.setVisible(false);


            }
        });
        strip_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(menu);
                panel.repaint();
                strip_2.setVisible(false);
                strip_1.setVisible(true);


            }
        });

        menu_class.visits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel.repaint();
                visit = visit_grafic.newJPanel(user_id);
                panel.add(visit);
                panel.repaint();

            }
        });
        visit_grafic.back_v.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel.remove(visit);
                panel.repaint();
                visit = visit_grafic.newJPanel(user_id);
                panel.add(visit);
                panel.repaint();

            }
        });

        visit_grafic.rev_v.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                panel.remove(visit);
                panel.repaint();
                visit = visit_grafic.newJPanel(user_id);
                panel.add(visit);
                panel.repaint();

            }
        });

        visit_grafic.create_visit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                visit_grafic.s_b(user_id);
                panel.remove(visit);
                panel.repaint();
                visit = visit_grafic.newJPanel(user_id);
                panel.add(visit);
                panel.repaint();

            }
        });

        home_class.start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(home);
                panel.repaint();
                log_in.setVisible(true);
                sing_in.setVisible(true);
                sing_in.setBackground(Color.LIGHT_GRAY);
                log_in.setBackground(Color.CYAN);
                log.setVisible(true);
                login_login.setVisible(true);
                first_login.setVisible(true);
                password_login.setVisible(true);
                second_login.setVisible(true);
                img_autentification.setVisible(true);



            }
        });
        autentification_class.r_end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("grafic");
                autentification_class.registr(user_id);
                img_autentification.setVisible(false);
                panel.remove(autentif);
                panel.repaint();
                m(user_id);
                strip_2.setVisible(true);


            }
        });
        menu_class.exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("graf");
                visit = visit_grafic.newJPanel(user_id);
                panel.remove(visit);
                panel.remove(menu);
                strip_1.setVisible(false);
                strip_2.setVisible(false);
                panel.add(home);
                panel.repaint();

            }
        });


        strip_1.setVisible(false);
        strip_2.setVisible(false);


        setContentPane(panel);


    }

    public void m(int user_id){
        menu = menu_class.newJPanel(user_id);
        panel.add(menu);
        panel.repaint();
    }



    public void check_log_in(String login, String password)throws SQLException, ClassNotFoundException{
        user_id = controler_user.autentification(login, password);



    }

    public void check_sing_in(String login, String password_1, String password_2)throws SQLException, ClassNotFoundException{
        if(password_1.equals(password_2)){
            user_id = controler_user.search_login(login);
            if (user_id == 0){
                controler_user.registration(login,password_1);
                user_id = controler_user.autentification(login, password_1);


            }
            else {
                registration_result = 2;
            }
        }else {
            registration_result = 1;
        }
    }



}
