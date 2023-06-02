package Redovalnica;
import java.util.ArrayList;
import java.util.Scanner;

public class Vhod {
    public static void main(String[] args) {
        
        int IzbiraMenija;
        ArrayList<String> SeznamPredmetov = predmet.getSeznamPredmetov();

        Scanner sc = new Scanner(System.in);

        IzbiraMenija = sc.nextInt();

        switch (IzbiraMenija){
            case 1:

                Predmet.DodajPredmet();

            case 2:

                Test.dodajOceno();

            case 3:



            case 4:

                Izpis.zakljuci();


            case 5:
                System.out.println("Hvala za uporabo. Nasvidenje!");
                System.exit(1);
            
        }



    }
}
