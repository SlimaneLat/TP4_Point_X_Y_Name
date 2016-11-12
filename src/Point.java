/**
 * Created by toshiba on 12/11/2016.
 */
public class Point {
    protected double x,y;
    Point (double x,double y){
        this.x=x;
        this.y=y;
    }
    Point(double x){
        this.x=this.y=x;
    }
    Point(){
        this.x=this.y=0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void deplace(int dx,int dy){
        x+=dx;y+=dy;
    }
    public void setX(double x ){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }


}
