package models;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class User {
    
    public static ArrayList<User> all_users = new ArrayList<User>(){
        {
            add(new User("Admin","Admin","Admin","admin@admin","1234","00/00/00",true));
        }
    };
    
    private String type_user;
    private String name;
    private String l_name;
    private String email;
    private String password;
    private String born_date;
    private boolean status;
    private  List<Rating> rating = new ArrayList<Rating>(){};
    private  List<Order> order = new ArrayList<Order>(){};
    private  List<Bill> bill = new ArrayList<Bill>(){};
    
    public User(String type_user, String name,String l_name, String email,String pass, String born_date, boolean status){
        this.type_user = type_user;
        this.name = name;
        this.l_name = l_name;
        this.email = email;
        this.born_date = born_date;
        this.status = status;
        this.password = pass;
        
        
    }


    public String getTypeUser(){
        return this.type_user;
    }
    
    public void setTypeUser(String typeuser) {
        this.type_user = typeuser;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLName(){
        return this.l_name;
    }
    
    public void setLName(String name){
        this.l_name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getBornDate(){
        return this.born_date;
    }
    
    public void setBornDate(String born){
        this.born_date = born;
    }
    
    public boolean getStatus(){
        return this.status;
    } 
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public List<Rating> getRating(){
        return this.rating;
    }
    
    public void setRating(List<Rating> rating){
        this.rating = rating;
    }
    
    public List<Order> getOrder(){
        return this.order;
    }
    
    public void setOrder(List<Order> order){
        this.order = order;
    }
    
    public List<Bill> getBill(){
        return this.bill;
    }
    
    public void setBill(List<Bill> bill){
        this.bill = bill;
    }
    
    public static boolean existUser(String em,String pass){
        for(User us: User.all_users){
            if(us.getPassword().equals(pass) && us.getEmail().equals(em)){
                return true;
            }
        }return false;
    }
    
    public static User getUser(String em,String pass){
        for(User us: User.all_users){
            if(us.getPassword().equals(pass) && us.getEmail().equals(em)){
                return us;
            }
        }return null;
    }
}   


