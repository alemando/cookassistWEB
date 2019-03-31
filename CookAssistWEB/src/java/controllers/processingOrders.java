package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Order;
import models.Product;
import models.User;

@WebServlet(urlPatterns = {"/processingOrders"})
public class processingOrders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("session_user");
        
        if(user != null) {
            
            String code = request.getParameter("code_order");
            int quan = Integer.parseInt(request.getParameter("quantity"));

            Product p = Product.getProductPerCode(code);
            
            Order actual_order = new Order(quan, p.getDescription(), p, user);
            user.setOrder(actual_order);

            RequestDispatcher view = request.getRequestDispatcher("processingorders.jsp");
            view.forward(request, response);
        }
        
        else{
            
            response.sendRedirect("./login");
            
        
        }
        

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("processingorders.jsp");
        view.forward(request, response);
    }

}
