package java5;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D(int x, int y) {
         this.x = x;
         this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
           this.x = x;
    }

    public void setY(int y) {
          this.y = y;
    }

    @Override
    public String toString() {
        //return "("+getX()+","+getY()+")";    
        //return "("+this.getX()+","+this.getY()+")";
        return "("+getX()+","+getY()+")";
    }
    
    public int liczbaWspolrzednych() {
        return 2;
    }
    
    public double odlegloscOdPunktu(Punkt2D p)
    {
        return sqrt(pow((getX()-p.getX()),2)+pow((getY()-p.getY()),2));
    }
}
