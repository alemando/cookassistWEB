package models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int code;
    private String description; 
    private  List<OrderDetail> detail = new ArrayList<OrderDetail>(){};
    private User user;
    private Chef chef;
    private  List<Rating> rating = new ArrayList<Rating>(){};
    private Bill bill;
    
    public Order(int code, String description, List<OrderDetail> detail, User user){
        this.code = code;
        this.description = description;
        this.detail = detail;
        this.user = user;
                
    }
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public List<OrderDetail> getOrderDetail(){
        return detail;
    }
    
    public void setOrderDetail(List<OrderDetail> detail){
        this.detail = detail;
    }
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    public Chef  getChef(){
        return chef;
    }
    
    public void setChef(Chef chef){
        this.chef = chef;
    }
    
    public List<Rating> getRating(){
        return rating;
    }
    
    public void setRating(List<Rating> rating){
        this.rating = rating;
    }
    
    public Bill getBill(){
        return bill;
    }
    
    public void setBill(Bill bill){
        this.bill = bill;
    }
}
