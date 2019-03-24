package models;
import java.util.Date;

public class Chef extends User {
    private boolean status;
    private Order order;
    private Rating rating;
    
    Chef(String type_user, String name, String email, Date born_date, boolean status){
        super(type_user, name, email, born_date, status);
    }
    
}
