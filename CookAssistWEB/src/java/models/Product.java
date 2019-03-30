package models;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public static ArrayList<Product> products = new ArrayList<Product>() {
        {
            add(new Product("HP Laptop", "100 GB RAM", 1999, "Juan"));
            add(new Product("Samsung Laptop", "Intel core iSupreme", 100, "Manuel"));
            add(new Product("MSI Laptop", "Itel Inside",100, "JuanitoGamer"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
        }

    };

    private static int auto_code = 0;
    private String code;
    private String name;
    private String description;
    private int price;
    //private String image;
    //private String user; //Mientras es String,luego es usuario
    private List<Rating> rating = new ArrayList<Rating>(){};
    private List<Order> order = new ArrayList<Order>(){};
    private String admin; //Mienttras es string (pruebas)
    

    public Product(String name, String description, int price, String admin ) {
        this.setCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.admin = admin;
        //Product.products.add(this);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode() {
        this.code = String.format("%06d", Product.auto_code++);;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public List<Rating> getRating() {
        return this.rating;
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }

    public List<Order> getOrder() {
        return this.order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public String getAdmin() {
        return this.admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
