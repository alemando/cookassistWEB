package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int code;
    private String name;
    private String description;
    private String category;
    private boolean avaliable;
    private  List<OrderDetail> order_detail = new ArrayList<OrderDetail>(){};
    
    public Product(int code, String name, String description, String category, boolean avaliable){
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
        this.avaliable = avaliable;
    }

    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public boolean getAvaliable(){
        return avaliable;
    }
    
    public void setAvaliable(boolean avaliable){
        this.avaliable = avaliable; 
    }
    
    public List<OrderDetail> getOrder_detail() {
        return order_detail;
    }

    public void setOrder_detail(List<OrderDetail> order_detail) {
        this.order_detail = order_detail;
    }
    
 
}