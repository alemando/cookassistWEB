package models;
import models.User;

public class Chef extends User {
    private boolean chef_status;
    private Order order;
    private Rating rating;
    public Chef(boolean chef_status){
        this.chef_status = chef_status;
    }
    
    public boolean getChef_status(){
        return chef_status;
    }
    
    public void setChef_status(boolean chef_status){
        this.chef_status = chef_status;
    }
}
