package models;

import java.util.Date;

public class User {
    private String type_user;
    private String name;
    private String email;
    private Date born_date;
    private Boolean status;
    private Rating rating[];
    private Order order[];
    private Bill bill[];
    
    public User(String type_user, String name, String email, Date born_date, Boolean status){
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
    
    public Boolean getStatus(){
        return status;
    } 
    
    public void setStatus(Boolean status){
        this.status = status;
    }
}    
