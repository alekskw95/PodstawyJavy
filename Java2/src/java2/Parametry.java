
package java2;

public class Parametry {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+" "+args[1]);
        
        //Wyswietlic pierwszy znam parametru pierwszego
        System.out.println(args[0].charAt(0));
        
        //Wyswietlic dlugosc parametru pierwszego
        System.out.println(args[0].length());
        
        //wyswietlic ostatni znak p1
        System.out.println(args[0].charAt(args[0].length()-1));
        
        //wyswietlic znaki par 1 kazdy w nowej linii
        for (int i = 0; i < args[0].length(); i++) {
            System.out.println(i +" "+args[0].charAt(i));
            
        }
        System.out.println("     ");
        //wyswietlic znaki par 1 kazdy w nowej linii od konca
        for (int i = args[0].length()-1; i >=0; i--) {
            System.out.println(i +" "+args[0].charAt(i));
            
        }
         System.out.println("     ");
         //wyswietlic znaki par 1 z duzych lister a 2 z malych liter
         System.out.println(args[0].toUpperCase());
         System.out.println(args[1].toLowerCase());
         
         System.out.println(args[2]);
         //System.out.println(args[3]);
         
         int wzrost = Integer.parseInt(args[2]);
         System.out.println(wzrost+5);
         int waga = Integer.parseInt(args[3]+2);
         System.out.println(waga+5);
         
         
         double wzrostM = wzrost/100.0;
         
         double bmi = waga/(wzrostM*wzrostM);
         System.out.println(bmi);
         
         //witaj dziewczyno/chlopaku
         //poznac po ostatnim znaku
        
         if(args[0].charAt(args[0].length()-1)=='a')
         {
             System.out.println("Witaj dziewczyno :)");
         }
         else
                  {
             System.out.println("Witaj chłopaku :)");
         }
         
             
        //nazywasz sie: Imie Nazwisko
        //imie i nazwisko pierwsza litera duza reszta mala
         //substring
         
         System.out.println(args[0].substring(0,1).toUpperCase()+args[0].substring(1,args[0].length()).toLowerCase());
         System.out.println(args[1].substring(0,1).toUpperCase()+args[1].substring(1,args[1].length()).toLowerCase());

         //twoj index bmi wynosi
         //twoja waga jest za mala/prawidlowa/za duza
         
         System.out.println("Twoj index BMI wynosi: "+ bmi);
         
         if(bmi<18.5){
            System.out.println("Waga jest za mala.");
         }
         else if(bmi>18.5 && bmi<25){
            System.out.println("Waga prawidłowa");
         }
         else if(bmi >25){
             System.out.println("Waga jest za duza");
         }                                
             
      

    }
    
}
