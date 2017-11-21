package java4;

public class Samochod {
    //wystarczy ten fragment aby wywolac konstruktor, metode get i set
    int dlugosc;
    int szerokosc;
    int predkoscJazdy;
    String nazwa;
    
    public Samochod(int dlugosc, int szerokosc, int predkoscJazdy, String nazwa) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.predkoscJazdy = predkoscJazdy;
        this.nazwa = nazwa;
    }

    public Samochod() {
    }
    
    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    
    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getPredkoscJazdy() {
        return predkoscJazdy;
    }

    
    public void setPredkoscJazdy(int predkoscJazdy) {
        this.predkoscJazdy = predkoscJazdy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    
//nadpisywana z klasy object, zwraca stringa, slowo super oznacza ze bedac
    //w miejscu odwolujemy sie do nadklasy
    @Override
    public String toString() {
        return getDlugosc()+" "+getSzerokosc()+" "+getPredkoscJazdy()+" "+getNazwa();
    }
    
    
    
}
