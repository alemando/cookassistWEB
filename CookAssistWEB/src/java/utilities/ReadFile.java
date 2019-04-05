/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import models.User;

public class ReadFile {
    public static void read() throws FileNotFoundException, IOException{
        
        File archivo = new File("Datosficticios.txt");
        FileReader fr= new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        Scanner scan = new Scanner(archivo);
        
        while(scan.hasNextLine()){
            String[] line  = scan.nextLine().split(";");
            boolean status;
            if((line[5]).equals("true")){
                status= true;
            }
            else{
                status=false;
            }
            User u = new User(line[0],line[1],line[2],line[3],line[4],status);
            System.out.println(line);
        }fr.close();
    }
    
}
