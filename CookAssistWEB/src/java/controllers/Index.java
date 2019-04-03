package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Product;


@WebServlet(urlPatterns = {"/Index"})
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
            
            HttpSession session = request.getSession(); 
            /*session.setAttribute("products",p1);
            request.setAttribute("products",p1);*/
            
            
            
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
            
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
            HttpSession session = request.getSession(); 
            session.setAttribute("loged",false);
            session.setAttribute("datos_f", false);
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
    }

}
