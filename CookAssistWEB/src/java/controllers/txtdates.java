/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;
import utilities.ReadFile;
/**
 *
 * @author user
 */
@WebServlet(name = "txtdates", urlPatterns = {"/txtdates"})
public class txtdates extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
            try{
            String app_path = getServletContext().getRealPath("");
            File archivo = new File("Datosficticios.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int lines = 0;
            while((line = br.readLine()) != null){
                 lines++;
                String [] user = line.split(";");
                User u= new User(user[0], user[1], user[2], user[3], user[4],Boolean.parseBoolean(user[5]));
            }
            br.close();
        }catch(IOException e){
            System.out.println("Error al leer");
        }
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
