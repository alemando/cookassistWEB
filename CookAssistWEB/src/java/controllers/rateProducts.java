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
import models.Rating;

@WebServlet(urlPatterns = {"/rateProducts"})
public class rateProducts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("session_user");
        String rate = request.getParameter("calification");
        String code = request.getParameter("code_prod");

        Product prod = Product.getProductPerCode(code);
        if (!rate.equals("0")) {
            Rating rating = new Rating(rate, prod, user);

            prod.setRating(rating);
            user.setRating(rating);
        }
        session.setAttribute("user_rating",user.getRating());
        RequestDispatcher view = request.getRequestDispatcher("products.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("products.jsp");
        view.forward(request, response);
    }

}
