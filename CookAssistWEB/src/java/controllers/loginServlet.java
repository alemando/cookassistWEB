package controllers;

import java.io.IOException;
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
        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");


        if (User.existUser(email, pass)) {
            session.setAttribute("loged", true);
            session.setAttribute("session_user", User.getUser(email, pass));
        } else {
            request.setAttribute("error", 2); //No existe
        }
        

        RequestDispatcher view = request.getRequestDispatcher("login.jsp");
        view.forward(request, response);

    }

}
//xd