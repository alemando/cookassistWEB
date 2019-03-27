package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int auto_code=1;
    private String code;
    private String name;
    private String description;
    private String category;
    private String avaliable;
    private  List<OrderDetail> order_detail = new ArrayList<OrderDetail>(){};
    
        public static List<Product> products = new ArrayList<Product>(){
            {
        //add(new Product("HP Laptop","asdasd","asdawqe","True"));
        //add(new Product("HP Laptop","asddssss","asdawqe","True"));
            } 
    };
    
    public Product(String name, String description, String category, String avaliable){
        this.code = String.format("%06d",Product.auto_code++);
        this.name = name;
        this.description = description;
        this.category = category;
        this.avaliable = avaliable;
        Product.products.add(this);
    }

    
    public String getCode(){
        return this.code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getCategory(){
        return this.category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public String getAvaliable(){
        return this.avaliable;
    }
    
    public void setAvaliable(String avaliable){
        this.avaliable = avaliable; 
    }
    
    public List<OrderDetail> getOrder_detail() {
        return order_detail;
    }

    public void setOrder_detail(List<OrderDetail> order_detail) {
        this.order_detail = order_detail;
    }
    
 
}