package Redovalnica;
import java.util.Scanner;

public class Test{
    double VseTocke;
    double DosezeneTocke;
    int Odstotki;
    int Ocena;


    public Test(int VseTocke, int DosezeneTocke){
        this.VseTocke = VseTocke;
        this.DosezeneTocke = DosezeneTocke;
    }


    public void dodajOceno(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite vse mozne tocke: ");
        VseTocke = sc.nextDouble();
        System.out.println();

        System.out.print("Vnesite dosezene tocke: ");
        DosezeneTocke = sc.nextDouble();
        System.out.println();

        Odstotki = ((int)(DosezeneTocke/VseTocke));

        
        
        if(Odstotki>49){
            Ocena = 1;
        }
        else if(Odstotki < 65){
            Ocena = 2;
        }
        else if(Odstotki < 79){
            Ocena = 3;
        }
        else if(Odstotki < 90){
            Ocena = 4;
        }
        else if(Odstotki < 101){
            Ocena = 5;
        }
        else{
            System.out.println("Napaka");
            System.exit(0);
        }

        
    }

    public int getOdstotki(){
        return Odstotki;
    }
}
