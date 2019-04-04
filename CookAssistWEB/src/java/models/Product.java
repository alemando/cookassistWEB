package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public static ArrayList<Product> Coincidencias = new ArrayList<Product>();
    public static ArrayList<Product> products = new ArrayList<Product>();


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

    public void setRating(Rating rating) {
        this.rating.add(rating);
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
        Product p5 = new Product("Perrito Caliente", "Pan, salchicha, ensalada y queso", 3500, "Admin");
        Product p6 = new Product("Pero Caliente Grande", "Pan, salchicha, ensalada y queso", 5000, "Admin");
        Product p7 = new Product("Perrito Caliente Especial", "Perro pequeño con queso y tocineta", 4500, "Admin");
        Product p8 = new Product("Perro Caliente Especial", "Pan, salchicha, ensalada, queso y  tocineta", 6000, "Admin");
        Product p9 = new Product("Hamburguesa Sencilla", "Pan, carne,queso y ensalada", 6000, "Admin");
        Product p10 = new Product("Hamburguesa Especial", "Pan, carne, queso, ensalada y tocineta", 7000, "Admin");
        Product p11 = new Product("Perrita", "Pan, queso tocineta y ensalada", 5000, "Admin");
        Product p12 = new Product("Hamburguesa Doble", "Pan, doble carne, queso, ensalada y tocineta", 10000, "Admin");
        Product p13 = new Product("Perra", "Pan, queso, tocineta y ensalada", 7000, "Admin");
        Product p14 = new Product("Cordon Blue", "Pechuga de pollo apanado con papas fritas y ensalada", 8000, "Admin");
        Product p15 = new Product("Picada de Carnes", "Contiene Carne de res y cerdo, pollo, chorizo coctel, arepa frita y ensalada", 21000, "Admin");
        Product p16 = new Product("1/2 Picada de Carnes", "Contiene Carne de res y cerdo, pollo, chorizo coctel, arepa frita y ensalada", 12000, "Admin");
        Product p17 = new Product("Picada Carnes Frías", "Salchichón, salchicha, jamoneta, papas fritas, ensalada", 20000, "Admin");
        Product p18 = new Product("1/2", "Salchichón, salchicha, jamoneta, papas fritas, ensalada", 11000, "Admin");
        Product p19 = new Product("Milanesa de Pollo", "Pechuga de pollo apanada con papas y ensalada", 6000, "Admin");
        Product p20 = new Product("Burguer Arepa", "Arepa frita, carne de hamburguesa, ensalada, queso y tocineta", 5000, "Admin");
        Product p21 = new Product("Arepa Rellena", "Arepa rellena con carne desmechada", 7000, "Admin");
        Product p22 = new Product("Arepa Rellena Pollo", "Arepa rellena con pollo desmechado", 7000, "Admin");
        Product p23 = new Product("Hamburguesa de Pollo Sencilla", "Pan, pollo,queso y ensalada", 7000, "Admin");
        Product p24 = new Product("Hamburguesa de Pollo Especial", "Pan, pollo, queso, ensalada y tocineta", 8000, "Admin");
        Product p25 = new Product("Chuzo de Pollo", "Chuzo de pollo con papas y ensalada", 9000, "Admin");
        Product p26 = new Product("Chuzo de Res", "Chuzo de carne de res con papas y ensalada", 8000, "Admin");
        Product p27 = new Product("Chuzo de Cerdo", "Chuco de carne de cerdo con papasy ensalada", 8000, "Admin");
        Product p28 = new Product("Cerdo a la plancha", "Carne de cerdo a la plancha con papas y ensalada", 14000, "Admin");
        Product p29 = new Product("Pollo a la plancha", "Pechuga de pollo a la plancha con papas y ensalada", 15000, "Admin");
        Product p30 = new Product("Res a la placha", "Carne de res a la plancha con papas y ensalada", 14000, "Admin");
        Product p31 = new Product("Cocacola 350ml", "Sin descripción", 2000, "Admin");
        Product p32 = new Product("Pepsi 350ml", "Sin descripción", 2000, "Admin");
        Product p33 = new Product("Manzana Postobón 350ml", "Sin descripción", 2000, "Admin");
        Product p34 = new Product("Colombiana 350ml", "Sin descripción", 2000, "Admin");
        Product p35 = new Product("Gaseosa Premio 350ml", "Sin descripción", 2000, "Admin");
        Product p36 = new Product("Cerveza Pilsen", "Sin descripción", 3000, "Admin");
        Product p37 = new Product("Cerveza Águila", "Sin descripción", 3000, "Admin");
        Product p38 = new Product("Cerveza Club Colombia", "Sin descripción", 3500, "Admin");
        Product p39 = new Product("Cerveza Poker", "Sin descripción", 3000, "Admin");
        Product p40 = new Product("Michelada", "Sin descripción", 5000, "Admin");
    }
}
