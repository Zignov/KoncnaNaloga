package Redovalnica;
import java.io.*;
import java.nio.charset.StandardCharsets;

import javax.swing.text.html.parser.Element;


public class Izpis {

    Arraylist<String> SeznamPredmetov = Predmet.getSeznamPredmetov(); 

    public void zakljuci(){
        try {
            PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("Redovalnica.txt"), StandardCharsets.UTF_8));

            for (){

            }
            pw.close();
            

        
        } catch (FileNotFoundException e) {
            
        }

        
    }

}
