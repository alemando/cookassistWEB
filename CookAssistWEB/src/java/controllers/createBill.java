/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import models.Bill;
import models.User;

/**
 *
 * @author MIS DOCUMENTOS
 */
@WebServlet(name = "createBill", urlPatterns = {"/createBill"})
public class createBill extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String co = request.getParameter("code_order");
        
        User user = (User) session.getAttribute("session_user");
    
        
        
        Order o = Order.getOrderPerCode(co);
        
        Bill actual_bill = new Bill(user, o);
        System.out.println(actual_bill);
        user.setBill(actual_bill);
        o.setFinish(true);
        
        RequestDispatcher view = request.getRequestDispatcher("createBill.jsp");
           view.forward(request, response);
        

        
    }

}
