package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;

@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); 

        if(null == session.getAttribute("email") || null == session.getAttribute("pass")){
            request.setAttribute("error", 2);
        }
    
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); 
        
        
        
        if(null != session.getAttribute("email") && null != session.getAttribute("pass")){
            String email = request.getParameter("email");
            String pass = request.getParameter("password");
            if(User.existUser(email,pass)){
                request.setAttribute("error",0); //Existe usuario
                session.setAttribute("loged", true);
            }
            else{
                request.setAttribute("error", 1); //No existe
            }
        }
        else{
            request.setAttribute("error", 2); //Espacio vacío, datos erroneos
        }
    
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);
        
    }

}
