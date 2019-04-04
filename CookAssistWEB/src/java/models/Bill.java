package models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill {

    public String code;
    public String date;
    public boolean cancelled = false;
    public User user;

    private static int auto_code = 1;
    
    private Order order;

    public Bill(User user,Order order) {
        this.order = order;
        this.setCode();
        this.user = user;
        this.setDate();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode() {
        this.code = String.format("%06d", Bill.auto_code++);;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        this.date = date;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public boolean getCancelled(){
        return this.cancelled;    
    }
    
    public void setCancelled(boolean cancelled){
        this.cancelled = cancelled;
    }
}
