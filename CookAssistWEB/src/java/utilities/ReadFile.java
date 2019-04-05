/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import models.User;

public class ReadFile {
    public void read() throws FileNotFoundException, IOException{
        URL url = getClass().getResource("miniDataBase.txt");
        File file = new File(url.getPath());
        Scanner scan = new Scanner(file);
        
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
        }
    }
    
}
