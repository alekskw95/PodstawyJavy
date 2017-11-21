package java3;

//Napisz program ktory odczyta plik liczby.txt
//a nastepnie wypisze na ekran
        //obie liczby oraz sume roznice iloczyn iloraz srA i srG z dwoch liczb
        //branych kazda z nowej lini
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java3.Kalkulator.zaokr;

        

public class ZadanieDomowe {
    
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("-----Odczyt z pliku-----");
        
        try{
            Scanner sc = new Scanner (new File("liczby.txt"));
        
            while(sc.hasNextLine()){
                //System.out.println(sc.nextLine());
                int liczba1, liczba2;
                liczba1=sc.nextInt();
                liczba2=sc.nextInt();
                System.out.println("Liczby: "+liczba1+" i "+liczba2);
                System.out.println("Suma liczb " + liczba1 + " i " + liczba2 + " wynosi " + (liczba1 + liczba2));
                System.out.println("Różnica liczb " + liczba1 + " i " + liczba2 + " wynosi " + (liczba1 - liczba2));
            System.out.println("Iloczyn liczb " + liczba1 + " i " + liczba2 + " wynosi " + (liczba1 * liczba2));
            if (liczba2 != 0) {
                System.out.println("Iloraz liczb " + liczba1 + " i " + liczba2 + " wynosi " + zaokr((double) liczba1 / liczba2));
            } else {
                System.out.println("Dzielenie nie wykonalne");
            }
            System.out.println("Srednia arytmetyczna liczb " + liczba1 + " i " + liczba2 + " wynosi " + (liczba1 + liczba2) / 2.0);
            if ((liczba1 >= 0) && (liczba2 >= 0)) {
                System.out.println("Srednia geometryczna liczb " + liczba1 + " i " + liczba2 + " wynosi " + zaokr(Math.sqrt(liczba1 * liczba2)));
            } else {
                System.out.println("Srednia geometryczna nie istnieje");
            }
            
            System.out.println("----------------------------");
           
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("Problem z odczytem pliku");
        }
        
        
    }
    
}
