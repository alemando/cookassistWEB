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

@WebServlet(urlPatterns = {"/registry"})
public class registryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<User> users = new ArrayList<User>();

        request.setAttribute("users", users);
        RequestDispatcher view = request.getRequestDispatcher("registry.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        ArrayList<User> users = User.all_users;

        String first_name = request.getParameter("first-name");
        first_name = first_name.substring(0,1).toUpperCase() + first_name.substring(1).toLowerCase();
        String last_name = request.getParameter("last-name");
        last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String date = request.getParameter("birthday");

        if (first_name.equals("") || last_name.equals("") | email.equals("") || pass.equals("") || date.equals("")){

            request.setAttribute("succes_registry", 0);

        }else {

            request.setAttribute("succes_registry", 1);

            User usuario = new User("normal", first_name, last_name, email, pass, date, false);

            User.all_users.add(usuario);

        }

        session.setAttribute("Users", users);
        request.setAttribute("users", users);
        RequestDispatcher view = request.getRequestDispatcher("registry.jsp");
        view.forward(request, response);

    }
}
