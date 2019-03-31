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

@WebServlet(urlPatterns = {"/createorder"})
public class createorder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        HttpSession session = request.getSession();
        
        
        String code = (String) request.getParameter("code_order");
        Product prod = Product.getProductPerCode(code);
        if(prod != null){
            session.setAttribute("product_code",prod);
        }
        
        
        
        /*if((boolean)session.getAttribute("loged")){            
            User u = (User) session.getAttribute("session_user");
            
            
            
            
            session.setAttribute("main_orders",u.getOrder());
        }*/
        

        RequestDispatcher view = request.getRequestDispatcher("createorder.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        

        RequestDispatcher view = request.getRequestDispatcher("createorder.jsp");
        view.forward(request, response);
    }

}
