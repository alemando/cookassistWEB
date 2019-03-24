package models;

public class Rating {
    private int code;
    private int score;
    private String description;
    private Order order;
    private User user;
    private Chef chef;
    
    public Rating(int code, int score, String description, Order order, User user){
        this.code = code;
        this.score = score;
        this.description = description;
        this.order = order;
        this.user = user;
    }
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
}
