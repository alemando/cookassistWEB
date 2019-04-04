package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public static ArrayList<Product> Coincidencias = new ArrayList<Product>();
    public static ArrayList<Product> products = new ArrayList<Product>() {
        {
            //add(new Product("HP Laptop", "100 GB RAM", 1999, "Juan"));
            //add(new Product("Samsung Laptop", "Intel core iSupreme", 100, "Manuel"));
            //add(new Product("MSI Laptop", "Itel Inside",100, "JuanitoGamer"));
            //add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
            //add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
            //add(new Product("MSI Laasdasdptop", "Itel Inside", 1000, "asdfad"));
        }

    };

    private static int auto_code = 1;
    private String code;
    private String name;
    private String description;
    private int price;
    //private String image;
    //private String user; //Mientras es String,luego es usuario
    private List<Rating> rating = new ArrayList<Rating>() {
    };
    private List<Order> order = new ArrayList<Order>() {
    };
    private String admin; //Mienttras es string (pruebas)

    public Product(String name, String description, int price, String admin) {
        this.setCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.admin = admin;
        Product.products.add(this);
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

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
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

    public static Product getProductPerCode(String code) {
        for (Product p : Product.products) {
            if (code.equals(p.getCode())) {
                return p;
            }
        }
        return null;
    }
    public static Product getProductobyname(String x){
        
        if ((Product.products).size()>0){
            for (Product p: Product.products){
                if ((x.equalsIgnoreCase(p.getName()))){
                    Product.Coincidencias.add(p);
                }
            }
        }
        return null;
    }

    public static void crearProductos() {
        Product p1 = new Product("Salchipapas", "Salchipapas Pequeñas con un huevo de codorniz", 2000, "Admin");
        Product p2 = new Product("Salchipapas", "Salchipapas Medianas con un huevo de codorniz", 4000, "Admin");
        Product p3 = new Product("Salchipapas", "Salchipapas Grandes con 2 huevos de codorniz", 6000, "Admin");
        Product p4 = new Product("Salchipapa Especial", "Salchipapas grandes con queso gratinado y 3 huevos de codorniz", 7500, "Admin");
        Product p5 = new Product("Perro Caliente", "Perro pequeño con queso", 3500, "Admin");
        Product p6 = new Product("Pero Caliente Grande", "Perro grande con queso", 5000, "Admin");
        Product p7 = new Product("Perro Caliente", "Perro pequeño con queso y tocineta", 4500, "Admin");
        Product p8 = new Product("Pero Caliente Grande", "Perro grande con queso y  tocineta", 6000, "Admin");
        Product p9 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p10 = new Product("Hamburguesa", "Hamburguesa con queso y tocineta", 7000, "Admin");
        Product p11 = new Product("Perra", "Perra pequeña con queso", 5000, "Admin");
        Product p12 = new Product("Hamburguesa", "Hamburguesa con doble carne queso y tocineta", 10000, "Admin");
        Product p13 = new Product("Perra Especial", "Perra grande con queso", 7000, "Admin");
        Product p14 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p15 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p16 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p17 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p18 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p19 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p20 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p21 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p22 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p23 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p24 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p25 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p26 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p27 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p28 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p29 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p30 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p31 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p32 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p33 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p34 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p35 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        Product p36 = new Product("Hamburguesa", "Hamburguesa Sencilla con queso", 6000, "Admin");
        
        
        
    }
}
