package punkty;

import java.util.Random;

public class Test {
    
    public static void main(String[] args) {
        
        /*Punkt2D p1 = new Punkt2D(1,2);
        Punkt2D p2 = new Punkt2D(3,4);
        
        System.out.println(p1); //aby zadzialalo potrzeba toString()
        System.out.println(p2);
        
        System.out.println("Liczba wspolrzednych punktu p1: "+p1.liczbaWspolrzednych());
        System.out.println("Liczba wspolrzednych punktu p2: "+p2.liczbaWspolrzednych());*/
        
        
        //System.out.println(p1);
        
        /*Punkt3D t1 = new Punkt3D(1,2,3);
        
        System.out.println(t1);
        System.out.println("Liczba wspolrzednych punktu t1: "+t1.liczbaWspolrzednych());*/
        
        
        Random generator = new Random();
        
       /* double liczba = generator.nextDouble();
        
        Punkt2D p;
        
        if(liczba < 0.5)
            p = new Punkt2D(1,2);
        else
            p = new Punkt3D(1,2,3);
        
        System.out.println(p);
        System.out.println(p.liczbaWspolrzednych());*/
        
       
        //przerobic cwiczenie 5 str 17
        System.out.println("********************* Praca domowa *********************");
        System.out.println("Punkty podane ręcznie:");
        Punkt2D pp = new Punkt2D(3,7);
        System.out.println("Odleglosc od zera punktu: " + pp + " wynosi: " + pp.odlegloscOdZera());
        Punkt3D ppp = new Punkt3D(-5,6,8);
        System.out.println("Odleglosc od zera punktu: " + ppp + " wynosi: " + ppp.odlegloscOdZera());
        
        System.out.println("Punkt wylosowany:");
        double liczba = generator.nextDouble();
        int a= generator.nextInt(35);
        int b = generator.nextInt(35);
        int c= generator.nextInt(35);
        
        Punkt2D p;
        if(liczba <0.5)
            p=new Punkt2D(a,b);
        else
            p=new Punkt3D(a,b,c);
        
        System.out.println(p);
        System.out.println("Liczba wspolrzednych punktu: "+ p.liczbaWspolrzednych());
        System.out.println("Odleglosc puntu od 0: "+ p.odlegloscOdZera());
        
        System.out.println(" ");
        
        
        System.out.println("---------------Tablica punktow---------------");
        
        
       Punkt2D[] tabPunktow =  new Punkt2D[10];

       for(int i=0; i<tabPunktow.length; i++)
       {
            double liczbaLos = generator.nextDouble();
            System.out.println("Lp LOS: " + liczbaLos);
            
            
            if( liczbaLos < 0.5){
                
                liczbaLos=liczbaLos*1000;

                int aa= (int) (liczbaLos/100)%10 ;
                int bb = (int) (liczbaLos/10)%10 ;
                
                Punkt2D pkt = new Punkt2D(aa , bb);
                tabPunktow[i] = pkt;
                
            }
            else{

                liczbaLos=liczbaLos*1000;
                int aa= (int) (liczbaLos/100)%10 ;
                int bb = (int) (liczbaLos/10)%10 ;
                int cc= (int) liczbaLos%10 ;
                Punkt3D pkt = new Punkt3D(aa , bb, cc);
                tabPunktow[i] = pkt;
            }             
       }
       System.out.println("Tablica punktów:");
       for(int i=0; i<tabPunktow.length; i++)
       {
           System.out.println(tabPunktow[i]);
       }
       
        System.out.println(" ----- Odleglosc dwóch punktów -----");
        Punkt2D p1= new Punkt2D(2,1);
        Punkt2D p2= new Punkt2D(1,2);
        System.out.println("Odleglosc pkt 1: "+p1+" od pkt 2: "+ p2+ " wynosi " + p1.odl(p2));
       
        System.out.println("----Trojkat----");
        Punkt2D[] tabPkt = new Punkt2D[3];
        for (int i = 0; i < 3; i++) {
            int aaa = generator.nextInt(16);
            int bbb = generator.nextInt(16);

            tabPkt[i] = new Punkt2D(aaa, bbb);
        }

        boolean trojkat = tabPkt[0].czyTrojkat(tabPkt[1], tabPkt[2]);
                
        if (trojkat) {
            System.out.println("Trojkat o wierzchołkach: " + tabPkt[0] + " " + tabPkt[1] + " " + tabPkt[2] + " " + " istnieje.");
        } else {
            System.out.println("Trojkat o wierzchołkach: " + tabPkt[0] + " " + tabPkt[1] + " " + tabPkt[2] + " " + " nie istnieje.");
        }

        System.out.println("  ");
        
    }
}
