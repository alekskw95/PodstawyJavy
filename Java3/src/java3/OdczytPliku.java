package java3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytPliku {
    
    public static void main(String[] args) {
        
        
        String napis = "ala ma kota";
        
        String[] tabNapisow =  napis.split(" ");
        
        for (String o : tabNapisow)
            System.out.println(o);
        
        System.out.println("-----Odczyt z pliku-----");
        
        try {
            Scanner sc = new Scanner(new File("plik.txt"));
           
            
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
                       
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Problem z odczytem pliku");
        }
        
        
    }
    
    
}
