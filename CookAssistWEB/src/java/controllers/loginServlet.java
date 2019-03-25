package controllers;
import java.io.IOException;
import java.io.PrintWriter; 
import javax.servlet.http.HttpSession; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;

@WebServlet(urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out=response.getWriter();


        String email = request.getParameter("email");
        String password = request.getParameter("pass");

        if(password.equals("1234") && email.equals("juan")){
            System.out.println("Welcome there");
        }

        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);

    }

}
