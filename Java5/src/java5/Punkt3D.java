package java5;

import static java.lang.Math.round;

public class Punkt3D extends Punkt2D {
    
    private int z;

    public Punkt3D(int x,int y,int z) {
        super(x, y);
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
        return super.liczbaWspolrzednych()+1; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double odlegloscOdZera() {
        int kwdr = (getX()*getX())+(getY()*getY())+(getZ()*getZ());
        double przekatna = Math.sqrt(kwdr);
         
        return round(przekatna);
    }
   
    
    
}
