/**
 * Created by toshiba on 12/11/2016.
 */public class PointA extends Point {
    public PointA(){
        super();
    }
    public PointA(double x,double y){
        super(x,y);
    }
    public void affichecoord(){
        System.out.println("X ="+super.getX()+"\n Y ="+super.getY());
    }
}
