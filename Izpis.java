package Redovalnica;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;



public class Izpis{
    
     

    public void zakljuci(ArrayList<Predmet> predmeti){



        try {
            PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("Redovalnica.txt"), StandardCharsets.UTF_8));
            
            for(Predmet predmet : predmeti){
                pw.println(predmet);    //predmet.getOcena
            }
            
            pw.close();
            

        
        } catch (FileNotFoundException e) {
            
        }

        
    }

}

