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
import models.Bill;
import models.Order;
import models.User;

/**
 *
 * @author MIS DOCUMENTOS
 */
@WebServlet(name = "cancelBill", urlPatterns = {"/cancelBill"})
public class cancelBill extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("cancelBill.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        String code = request.getParameter("code_bill");

        User user = (User) session.getAttribute("session_user");

        user.delBillPerCode(code);

        RequestDispatcher view = request.getRequestDispatcher("cancelBill.jsp");
        view.forward(request, response);

    }
}

   