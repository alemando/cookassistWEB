package controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Product;
import models.User;

@WebServlet(urlPatterns = {"/products"})
public class products extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        if (session.getAttribute("Products")==null){
            Product.crearproductos();
        }
          
        session.setAttribute("Products", Product.products);
        /*
        if((boolean)session.getAttribute("loged")){            
            User u = (User) session.getAttribute("session_user");
            if(request.getAttribute("order") != null){
                Product prod = (Product) request.getAttribute("order");
                //u.setOrder
            }
            session.setAttribute("main_orders",u.getOrder());
        }
        */

        RequestDispatcher view = request.getRequestDispatcher("products.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("Products", Product.products);

        RequestDispatcher view = request.getRequestDispatcher("products.jsp");
        view.forward(request, response);
    }

}
