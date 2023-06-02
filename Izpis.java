package Redovalnica;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import javax.imageio.IIOException;



public class Izpis{
    
     

    public void zakljuci(ArrayList<Predmet> predmeti){



        try {
            PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("Redovalnica.txt"), StandardCharsets.UTF_8));
            
            for(Predmet predmet : predmeti){
                pw.println(String.join(",",new String[]{
                    predmet.getNaziv()+" ",
                    predmet.getOcena()+" - ",
                    predmet.getPovprecje()+" "
                }));    //predmet.getOcena
            }
            
            pw.close();
            

        
        } catch (FileNotFoundException e) {
            System.out.println("Zgodila se je napaka (File not found)");
        }

        catch(IIOException e){
            System.out.println("Zgodila se je napaka (IO Exception)");
        }

        
    }

}

