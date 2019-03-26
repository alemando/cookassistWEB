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

@WebServlet(urlPatterns = {"/registryServlet"})
public class registryServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); 
        List<User> users = new ArrayList<User>();   
        
        if(null != session.getAttribute("email") && null != session.getAttribute("pass") && null != session.getAttribute("first-name") 
                && null != session.getAttribute("last-name")){
            users=(ArrayList<User>) session.getAttribute("users");
        }
        
        request.setAttribute("users", users);        
        RequestDispatcher view = request.getRequestDispatcher("registry.jsp");
        view.forward(request, response);
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(); 
        List<User> users = new ArrayList<User>();   
        
        if(null != session.getAttribute("email") && null != session.getAttribute("pass") && null != session.getAttribute("first-name") 
                && null != session.getAttribute("last-name")){
            users=(ArrayList<User>) session.getAttribute("users");
        }
        
        
        String first_name = request.getParameter("first-name");
        String last_name = request.getParameter("last-name");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String date = request.getParameter("birthday");
        User usuario = new User("normal",first_name+" "+last_name,email,pass,date,false);
        
        users.add(usuario);
        
        session.setAttribute("Users", users);
        request.setAttribute("users", users);        
        RequestDispatcher view = request.getRequestDispatcher("registry.jsp");
        view.forward(request, response);
        

        
    }
}
