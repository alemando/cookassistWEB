package models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill {
    public int code;
    public Date date;
    public User user;
    private  List<Order> order = new ArrayList<Order>(){};

    
    public Bill(int code, Date date, User user, List<Order> order){
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
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public List<Order> getOrder(){
        return order;
    }
    
    public void setOrder(List<Order> order){
        this.order = order;
    }
}
