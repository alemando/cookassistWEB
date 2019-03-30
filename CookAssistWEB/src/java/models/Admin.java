package models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Admin extends User {
    private boolean status;
    private List<Product> product = new ArrayList<Product>(){};
    
    Admin(String name,String l_name, String email,String pass, String born_date, boolean status){
        super( name,l_name, email,pass, born_date, true);
    }
    
    public List<Product> getProduct() {
        return this.product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
    
}
