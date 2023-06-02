package Redovalnica;
import java.util.ArrayList;
import java.util.Scanner;

public class Predmet {

    private String naziv;
    ArrayList<Integer> ocene = new ArrayList<>();
    private double povprecje;


    public Predmet(String naziv, ArrayList ocene, double povprecje){
        this.naziv = naziv;
        this.ocene = ocene;
        this.povprecje = povprecje;
    }



    public String getNaziv(){
        return naziv;
    }

    public ArrayList getOcene(){
        return ocene;
    }

    public double getPovprecje(){
        int skupekOcen = 0;
        for(int i = 0; i<ocene.size(); i++){
            skupekOcen += (int)ocene.get(i);
        }
        return(skupekOcen/ocene.size());
    }
    
    ArrayList<Predmet> SeznamPredmetov = new ArrayList<>();


    public void DodajPredmet(){
        Scanner sc = new Scanner(System.in);

        SeznamPredmetov.add(sc.nextLine());
        sc.close();
    }





}
