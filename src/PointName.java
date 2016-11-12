/**
 * Created by toshiba on 12/11/2016.
 */
public class PointName extends PointA {
    String Name;


    public PointName(String n,double x,double y) {
        super(x,y);
        this.Name=n;
    }
    public void affichecoord(){
        System.out.println("le nom du point :"+Name);
        super.affichecoord();
    }

}
