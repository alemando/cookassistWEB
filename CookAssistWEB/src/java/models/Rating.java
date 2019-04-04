package models;

public class Rating {
    private String score;
    private Product product;
    private User user;
    
    
    public Rating(String score, Product product, User user){
        this.score = score;
        this.product = product;
        this.user = user;
    }
    
    public String getScore(){
        return this.score;
    }
    
    public void setScore(String score){
        this.score = score;
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
