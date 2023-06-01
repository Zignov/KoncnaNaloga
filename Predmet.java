package Redovalnica;
import java.util.ArrayList;
import java.util.Scanner;

public class Predmet {
    
    ArrayList<String> SeznamPredmetov = new ArrayList<>();


    public void DodajPredmet(){
        Scanner sc = new Scanner(System.in);

        SeznamPredmetov.add(sc.nextLine());
        sc.close();
    }


}
