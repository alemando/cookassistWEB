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

@WebServlet(urlPatterns = {"/logout"})
public class logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        if (((boolean) session.getAttribute("loged")) && session.getAttribute("session_user") != null) {
            session.setAttribute("loged", false);
            session.setAttribute("session_user", null);
        }
        else{
            
        }
        RequestDispatcher view = request.getRequestDispatcher("./Index");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        RequestDispatcher view = request.getRequestDispatcher("./Index");
        view.forward(request, response);

    }

}
