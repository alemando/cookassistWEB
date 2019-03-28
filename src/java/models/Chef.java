package models;
import java.util.Date;

public class Chef extends User {
    private boolean status;
    private Order order;
    private Rating rating;
    
    Chef(String type_user, String name,String l_name, String email,String pass, String born_date, boolean status){
        super(type_user, name,l_name, email,pass, born_date, status);
    }
    
}
