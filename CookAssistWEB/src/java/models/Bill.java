package models;
import java.util.Date;

public class Bill {
    public int code;
    public Date date;
    public User user;
    public Order order[];
    
    public Bill(int code, Date date, User user, Order order[]){
        this.code = code;
        this.date = date;
        this.user = user;
        this.order = order;
    }
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code; 
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
}
