package punkty;

public class Punkt2D {
    
    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        //if(x>0)
            this.x = x;
        //else
            //this.x=0;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if(x>0)
            this.x = x;
    }

    public void setY(int y) {
        if(y>0)
            this.y = y;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
        //return "("+this.getX()+","+this.getY()+")";
        //return "("+x+","+y+")";
    }
    
    public int liczbaWspolrzednych(){
        return 2;
    }
    
    public double odlegloscOdZera(){
        int kwdr = (this.x*this.x)+(this.y*this.y);
        double przekatna = Math.sqrt(kwdr);
         
        return round(przekatna);
    }
    
    
    public double round(double number){
        number = number * 100;
        number = Math.round(number);
        number = number / 100;
        return number;
    }
    
    public double odl(Punkt2D a){
        int xx = a.getX()-getX();
        int yy = a.getY()-getY();
        int kwdr = (xx*xx)+(yy*yy);
        double przekatna = Math.sqrt(kwdr);

        return round(przekatna);
    }
    
    boolean czyTrojkat(Punkt2D B, Punkt2D C){
    double AB= this.odl(B);
    double BC= B.odl(C);
    double CA= C.odl(this);
    
    if ((AB+BC>CA) && (AB+CA>BC) && (BC+CA)>AB)
        return true;
    else 
        return false;
    
    }
    
}
