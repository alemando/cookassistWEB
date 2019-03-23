package models;

public class User {
    private String typeUser;
    private String name;
    private String email;
    private Calendar born;
    private Boolean status;
    private Rating rating[];
    private Order order[];
    private Bill bill[];
    
    public User(String typeUser, String name, String email, Calendar born, Boolean status){
        this.typeUser = typeUser;
        this.name = name;
        this.email = email;
        this.born = born;
        this.status = status;
    }


    public String getTypeUser(){
        return typeUser;
    }
    
    public void setTypeUser(String typeuser) {
        this.typeUser = typeuser;
        
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
    
    public Calendar getBorn(){
        return born;
    }
    
    public void setBorn(Calendar born){
        this.born = born;
    }
    
    public Boolean getStatus(){
        return status;
    } 
    
    public void setStatus(Boolean status){
        this.status = status;
    }
}    
