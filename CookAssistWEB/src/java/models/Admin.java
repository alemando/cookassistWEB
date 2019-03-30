package models;
import java.util.Date;

public class Admin extends User {
    private boolean status;
    private Order order;
    private Rating rating;
    
    Admin(String type_user, String name,String l_name, String email,String pass, String born_date, boolean status){
        super( name,l_name, email,pass, born_date, true);
    }
    
}
