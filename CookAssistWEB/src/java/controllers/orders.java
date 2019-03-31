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
import models.Order;
import models.Product;
import models.User;

@WebServlet(urlPatterns = {"/orders"})
public class orders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        User user = (User) session.getAttribute("session_user");
        
        ArrayList<Order> orders = (ArrayList) user.getOrder();
        
        request.setAttribute("user_orders", orders);
        
        RequestDispatcher view = request.getRequestDispatcher("orders.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("orders.jsp");
        view.forward(request, response);
    }

}
