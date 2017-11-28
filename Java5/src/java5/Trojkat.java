package java5;

import java.util.Scanner;


public class Trojkat {

    public static boolean czyTrojkat(Punkt2D p1, Punkt2D p2, Punkt2D p3){
        //TODO
        double AB= p1.odlegloscOdPunktu(p2);
        double BC= p2.odlegloscOdPunktu(p3);
        double CA= p3.odlegloscOdPunktu(p1);

        if ((AB+BC>CA) && (AB+CA>BC) && (BC+CA)>AB)
            return true;
        else 
            return false;
        
    }
            
    public static double poleTrojkata(Punkt2D p1, Punkt2D p2, Punkt2D p3){
        double AB= p1.odlegloscOdPunktu(p2);
        double BC= p2.odlegloscOdPunktu(p3);
        double CA= p3.odlegloscOdPunktu(p1);
        
        double pole = (AB+BC+CA)/2;
        double poleT = Math.sqrt(pole*(pole-AB)*(pole-BC)*(pole-CA));
        return poleT;
    }
            
    public static void main(String[] args) {
       
        /*Punkt2D p1 = new Punkt2D(0,0);
        Punkt2D p2 = new Punkt2D(1,1);
        
        
        System.out.println(p1.odlegloscOdPunktu(p2));
        System.out.println(p2.odlegloscOdPunktu(p1));*/
        
        //Wczytujemy od uzytkownika np scanerem wspolrezdne 3 punktow i sprawdzamy
        //czy tworza  trojkat jezeli tak wyzanczamy pole

        /*Punkt2D pkt1 = new Punkt2D(4,5);
        Punkt2D pkt2 = new Punkt2D(1,7);
        Punkt2D pkt3 = new Punkt2D(3,2);*/

        int x,y,xx,yy,xxx,yyy;
        
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj wartosci pierwsze.");
        x = odczyt.nextInt();
        y = odczyt.nextInt();
        System.out.println("Podaj wartosci drugie.");
        xx = odczyt.nextInt();
        yy = odczyt.nextInt();
        System.out.println("Podaj wartosci trzecie.");
        xxx = odczyt.nextInt();
        yyy = odczyt.nextInt();
        
        Punkt2D pkt1 = new Punkt2D(x,y);
        Punkt2D pkt2 = new Punkt2D(xx,yy);
        Punkt2D pkt3 = new Punkt2D(xxx,yyy);
        
        boolean trojkat = Trojkat.czyTrojkat(pkt1, pkt2, pkt3);
                
        if(trojkat){
            System.out.println(poleTrojkata(pkt1, pkt2, pkt3));
        }
        else{
            System.out.println("Nie tworzą trojkata.");
        }
        

        
    }
    
}
