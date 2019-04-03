package models;




public class Order {
    private static int auto_code = 0;
    private String code;
    private int quantity;
    private String description; 
    private Product product;
    private User user;
    private Bill bill;
    private int price;
    
    public Order(int quantity, String description,Product product, User user){
        this.setCode();
        this.setPrice(product,quantity);
        this.quantity= quantity;
        this.description = description;
        this.product = product;
        this.user = user;
        
                
    }
    
    public String getCode(){
        return this.code;
    }
    
     public void setCode() {
        this.code = String.format("%06d", Order.auto_code++);;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getDescription(){
        return description;
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
 
    public Bill getBill(){
        return bill;
    }
    
    public void setBill(Bill bill){
        this.bill = bill;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(Product p, int q){
        this.price= p.getPrice()*q;
    }
   
}
