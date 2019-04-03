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

@WebServlet(urlPatterns = {"/datosFicticios"})
public class datosFicticios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        session.setAttribute("datos_f", true);
        if ((Product.products).size()==0){
        Product.crearProductos();
        }

        /*
        if((boolean)session.getAttribute("loged")){            
            User u = (User) session.getAttribute("session_user");
            if(request.getAttribute("order") != null){
                Product prod = (Product) request.getAttribute("order");
                //u.setOrder
            }
            session.setAttribute("main_orders",u.getOrder());
        }
         */
        RequestDispatcher view = request.getRequestDispatcher("./Index");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("./Index");
        view.forward(request, response);
    }

}
