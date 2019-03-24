package models;

public class Order {
    private int code;
    private String description;
    private OrderDetail detail[];
    private User user;
    private Chef chef;
    private Rating rating[];
    private Bill bill;
    
    public Order(int code, String description, User user){
        this.code = code;
        this.description = description;
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
}
