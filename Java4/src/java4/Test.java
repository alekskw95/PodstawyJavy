package java4;

import java.util.Random;
import punkty.Punkt2D;
import punkty.Punkt3D;


public class Test {

    
    public static void main(String[] args) {
        
        Samochod sam1 = new Samochod();
        
        System.out.println(sam1.getDlugosc());
        System.out.println(sam1.getSzerokosc());
        System.out.println(sam1.getPredkoscJazdy());
        System.out.println(sam1.getNazwa());
        
        sam1.setDlugosc(4400);
        sam1.setSzerokosc(2600);
        sam1.setPredkoscJazdy(230);
        sam1.setNazwa("Ford");
        
        System.out.println(sam1.getDlugosc());
        System.out.println(sam1.getSzerokosc());
        System.out.println(sam1.getPredkoscJazdy());
        System.out.println(sam1.getNazwa());
        
        Samochod sam2 = new Samochod();
        
        System.out.println(sam2.getDlugosc());
        System.out.println(sam2.getSzerokosc());
        System.out.println(sam2.getPredkoscJazdy());
        System.out.println(sam2.getNazwa());
        
        sam2.setDlugosc(4200);
        sam2.setSzerokosc(2200);
        sam2.setPredkoscJazdy(180);
        sam2.setNazwa("Audi");
        
        System.out.println(sam2.getDlugosc());
        System.out.println(sam2.getSzerokosc());
        System.out.println(sam2.getPredkoscJazdy());
        System.out.println(sam2.getNazwa());
        
        System.out.println("sam1: "+sam1); //wywoluje sie metoda tostring
        System.out.println("sam2: "+sam2);
        
        Samochod sam3 = new Samochod(3800,1900,130,"BMW"); //to moge dzieki konstruktorowi
        
        System.out.println(sam3.getDlugosc());
        System.out.println(sam3.getSzerokosc());
        System.out.println(sam3.getPredkoscJazdy());
        System.out.println(sam3.getNazwa());
        
        System.out.println("sam3: "+sam3);
        
        
        
        
    }
    
}
