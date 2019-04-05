package controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

@WebServlet(urlPatterns = {"/users"})
public class users extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        User user = (User) session.getAttribute("session_user");
        
        request.setAttribute("admin_users",User.all_users);
        
        RequestDispatcher view = request.getRequestDispatcher("users.jsp");
        view.forward(request, response);        
    }

}