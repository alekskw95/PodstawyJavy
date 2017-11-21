package java3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {

    //100*45,5685667...=4556, -> round -> 4556 /100.0 
    public static double zaokr(double liczba) {
        return Math.floor(liczba * 100) / 100.0;
    }

    public static void main(String[] args) {

        try {

            System.out.println("Hello");

            Scanner sc = new Scanner(System.in);

            //System.out.print("Przedstaw sie: ");
            //String odczyt = sc.nextLine();
            //System.out.println(odczyt);
            System.out.println("------------Kalkulator----------");

            System.out.print("Podaj pierwszą liczbę: ");
            int liczba1 = sc.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int liczba2 = sc.nextInt();

            // roznice liczb
            // iloczyn liczb
            // iloraz liczb ? /0
            // srednia arytmetyczna liczb (a+b)/2
            // srdnia geometryczna liczb >0= >= 0 sqrt(a*b)
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

            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Blednie podana liczba");
        }

    }

}
