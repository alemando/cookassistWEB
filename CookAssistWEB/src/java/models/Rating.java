package models;

public class Rating {
    private int code;
    private int score;
    private String description;
    private Product product;
    private User user;
    
    
    public Rating(int code, int score, String description, Product product, User user){
        this.code = code;
        this.score = score;
        this.description = description;
        this.product = product;
        this.user = user;
    }
    
    public int getCode(){
        return this.code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public Product getProduct(){
        return this.product;
    }
    
    public void setProduct(Product product){
        this.product = product;
    }
    
    public User getUser(){
        return this.user;
    }
    
    public void setUser(User user){
        this.user = user;
    }    
}
