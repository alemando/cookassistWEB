package models;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private static int auto_code = 1;
    private String code;
    private String name;
    private String description;
    private String user; //Mientras es String,luego es usuario
    private List<OrderDetail> order_detail = new ArrayList<OrderDetail>() {
    };

    public static ArrayList<Product> products = new ArrayList<Product>();

    public Product(String name, String description, String user) {
        this.code = String.format("%06d", Product.auto_code++);
        this.name = name;
        this.description = description;
        this.user = user;
        Product.products.add(this);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
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
