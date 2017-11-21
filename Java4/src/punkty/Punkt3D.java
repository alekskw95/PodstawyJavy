package punkty;

public class Punkt3D extends Punkt2D{
    
    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);  //wez teraz nadklase w stosunku do klasy a nad nia jest punkt2d i wywolaj metode punkt x y
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+z+")";
    }

    @Override
    public int liczbaWspolrzednych() {
        return super.liczbaWspolrzednych()+1; //wykorzystaj jawnie wywolanie wczesniejsze i zwieksz o 1
    }
    
    @Override
    public double odlegloscOdZera() {
        int kwdr = (getX()*getX())+(getY()*getY())+(getZ()*getZ());
        double przekatna = Math.sqrt(kwdr);
         
        return round(przekatna);
    }
    
    boolean czyTrojkat(){
    
        if ((getX()+getY()>getZ()) && (getX()+getZ()>getY()) && (getY()+getZ()>getX()))
            return true;
        else 
            return false;
    
    }
    
}
