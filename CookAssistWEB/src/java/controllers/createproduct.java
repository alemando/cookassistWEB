package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Product;

/**
 *
 * @author user
 */
@WebServlet(name = "createproduct", urlPatterns = {"/createproduct"})
public class createproduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        
        HttpSession session = request.getSession();
        List<Product> products = new ArrayList<>();
        request.setAttribute("product", products);
        RequestDispatcher view = request.getRequestDispatcher("createproduct.jsp");
        view.forward(request, response);        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        ArrayList<Product> products = Product.products;
        request.setAttribute("succes_created", 1);
        String prod_name = request.getParameter("prod_name");   
        String prod_desc = request.getParameter("prod_desc");
        String pro_price = request.getParameter("prod_price");
        int prod_price = Integer.parseInt(pro_price);
        
        if((prod_price<1000)||(prod_name.equals(""))||(prod_desc.equals(""))){
            
            request.setAttribute("succes_created", 0);
            
        }else{
            request.setAttribute("succes_created", 1);
            prod_name = prod_name.substring(0,1).toUpperCase()+prod_name.substring(1).toLowerCase();
            prod_desc = prod_desc.substring(0,1).toUpperCase()+prod_desc.substring(1).toLowerCase();
            
            Product producto = new Product(prod_name,prod_desc,prod_price,"Admin");
            
            
        }
        
        session.setAttribute("Product", products);
        request.setAttribute("product", products);
        
        RequestDispatcher view = request.getRequestDispatcher("createproduct.jsp");
        view.forward(request, response);
    }
}