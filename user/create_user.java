package user;

public class create_user {
    public static user start(String name, String surname, Integer number, String email, Integer year, Integer mount, Integer day, Integer grow, Integer weight, Integer user_id){
        user u = new user();
        u.setName_u(name);
        u.setSurname_u(surname);
        u.setNumber_u(number);
        u.setEmail(email);
        u.setAge_u(year, mount, day);
        u.setGrow_u(grow);
        u.setWeight_u(weight);
        u.setId_u(user_id);
        System.out.println("weight - "+weight);

//        return new user(user_id, surname, name, number, email, grow, year, mount, day, weight, null);
        return u;
    }
}
