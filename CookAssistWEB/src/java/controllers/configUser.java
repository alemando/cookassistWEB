package controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Product;
import models.User;

@WebServlet(urlPatterns = {"/configUser"})
public class configUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("configUser.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("session_user");

        boolean error = false;
        boolean error_2 = false;
        session.setAttribute("error_config", error);

        String name = request.getParameter("name");
        String lname = request.getParameter("lname");
        String pass = request.getParameter("pass_n");
        if (name != null && lname != null && pass != null) {
            if (pass.equals(user.getPassword())) {
                user.setName(name);
                user.setLName(lname);
                //name = null;
                //lname = null;
                //pass = null;
                error_2 = true;
            } else {
                error = true;
            }
        } else {
            error = true;
        }

        String email = request.getParameter("email");
        String pass_2 = request.getParameter("pass_e");
        if (email != null && pass_2 != null) {
            if (pass_2.equals(user.getPassword())) {
                user.setEmail(email);
                error_2 = true;
            } else {
                error = true;
            }
        } else {
            error = true;
        }
        String c_pass = request.getParameter("change_pass");
        String c_pass_2 = request.getParameter("change_pass_2");
        String pass_3 = request.getParameter("pass_c");
        if (c_pass != null && c_pass_2 != null) {
            if (pass_3.equals(user.getPassword()) && c_pass.equals(c_pass_2)) {
                user.setPassword(c_pass);
                error_2 = true;
            } else {
                error = true;
            }
        } else {
            error = true;
        }
        String code_a = request.getParameter("code_admin");
        if (code_a != null && code_a.equals("admin1234")) {
            user.setStatus(true);
            error_2 = true;
        } else {
            error = true;
        }
        if(error_2){
            session.setAttribute("error_config", false);
        }
        else{
            session.setAttribute("error_config", error);
        }
        RequestDispatcher view = request.getRequestDispatcher("configUser.jsp");
        view.forward(request, response);
    }

}
