package user;

import basis.controler;

import java.sql.SQLException;

public class controler_user {
    database_autentification database_autentification = new database_autentification();
    database_registration database_registration = new database_registration();
    controler contr = new controler();
    data_parsing data = new data_parsing();
    public user user;
    private int user_id = contr.id;

    public int autentification(String login, String password)throws SQLException, ClassNotFoundException{
        user_id = database_autentification.autentification(login,password);
        user = database_registration.get_user(user_id);
        return user_id;
    }

    public void registration(String login, String password)throws SQLException, ClassNotFoundException{
        database_registration.registration(login, password);
        this.user_id = database_autentification.autentification(login,password);
    }

    public void registration_data(String name,String surname,int number,String email,Integer year,Integer mount,Integer day,Integer grow,Integer weight, int user_id)throws SQLException, ClassNotFoundException{
        database_registration.create_user(create_user.start(name, surname, number, email, year, mount, day, grow, weight, user_id), user_id);

    }

    public void save_edit_v(String name,String surname,int number,String email,Integer year,Integer mount,Integer day,Integer grow,Integer weight, int user_id)throws SQLException, ClassNotFoundException{
        System.out.println("second");
        database_registration.edit_user(create_user.start(name, surname, number, email, year, mount, day, grow, weight, user_id), user_id);
        System.out.println("finish");
    }

    public int search_login(String login)throws SQLException, ClassNotFoundException{
        user_id = database_autentification.search_login(login);
        return user_id;
    }

    public user menu_data_user(int user_id) throws SQLException, ClassNotFoundException{
        user = database_registration.get_user(user_id);
        return user;

    }

    public int[] get_d(int user_id)throws SQLException, ClassNotFoundException{
        return data.data_db(database_registration.get_user_data(user_id));
    }
}
