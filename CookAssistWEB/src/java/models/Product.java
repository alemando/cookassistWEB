package models;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public static ArrayList<Product> products = new ArrayList<Product>() {
        {
            add(new Product("HP Laptop", "100 GB RAM", "Juan"));
            add(new Product("Samsung Laptop", "Intel core iSupreme", "Manuel"));
            add(new Product("MSI Laptop", "Itel Inside", "JuanitoGamer"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", "asdfad"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", "asdfad"));
            add(new Product("MSI Laasdasdptop", "Itel Inside", "asdfad"));
        }

    };

    private static int auto_code = 0;
    private String code;
    private String name;
    private String description;
    private String user; //Mientras es String,luego es usuario
    private List<OrderDetail> order_detail = new ArrayList<OrderDetail>() {
    };

    public Product(String name, String description, String user) {
        this.setCode();
        this.name = name;
        this.description = description;
        this.user = user;
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

    public List<OrderDetail> getOrder_detail() {
        return order_detail;
    }

    public void setOrder_detail(List<OrderDetail> order_detail) {
        this.order_detail = order_detail;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
