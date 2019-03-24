package models;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String type_user;
    private String name;
    private String email;
    private Date born_date;
    private boolean status;
    private  List<Rating> rating = new ArrayList<Rating>(){};
    private  List<Order> order = new ArrayList<Order>(){};
    private  List<Bill> bill = new ArrayList<Bill>(){};
    
    public User(String type_user, String name, String email, Date born_date, boolean status){
        this.type_user = type_user;
        this.name = name;
        this.email = email;
        this.born_date = born_date;
        this.status = status;
    }


    public String getTypeUser(){
        return type_user;
    }
    
    public void setTypeUser(String typeuser) {
        this.type_user = typeuser;
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public Date getBornDate(){
        return born_date;
    }
    
    public void setBornDate(Date born){
        this.born_date = born;
    }
    
    public boolean getStatus(){
        return status;
    } 
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public List<Rating> getRating(){
        return rating;
    }
    
    public void setRating(List<Rating> rating){
        this.rating = rating;
    }
    
    public List<Order> getOrder(){
        return order;
    }
    
    public void setOrder(List<Order> order){
        this.order = order;
    }
    
    public List<Bill> getBill(){
        return bill;
    }
    
    public void setBill(List<Bill> bill){
        this.bill = bill;
    }
}   


