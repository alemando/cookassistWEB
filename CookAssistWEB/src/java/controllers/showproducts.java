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
@WebServlet(name = "showproducts", urlPatterns = {"/showproducts"})
public class showproducts extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();  
        session.setAttribute("products", Product.products);
        request.setAttribute("products", Product.products);
        RequestDispatcher view = request.getRequestDispatcher("showproducts.jsp");
        view.forward(request, response);        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        
        HttpSession session = request.getSession();        
        List<Product> products = new ArrayList<>();
        
        if(null != session.getAttribute("Products")){
            products=(ArrayList<Product>) session.getAttribute("Products");
        }
        int code = Integer.parseInt(request.getParameter("code"));
        String name = request.getParameter("name");
        String description = request.getParameter("description"); 
        String category = request.getParameter("category");
        String avaliable= request.getParameter("avaliable");
        Product p = new Product(code,name,description,category,avaliable);
        products.add(p);
        
        session.setAttribute("Products", products);
        request.setAttribute("products", products);        
        RequestDispatcher view = request.getRequestDispatcher("showproducts.jsp");
        view.forward(request, response);
    }
}
