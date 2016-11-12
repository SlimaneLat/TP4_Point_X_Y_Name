/**
 * Created by toshiba on 12/11/2016.
 */
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String inc;
        int in,in0;
        Point F = new Point();
        PointA P = new PointA(3,5);
        PointName O ;
        double x,y;
        System.out.println("Donnez svp le nom de votre point : ");
        inc =  s.nextLine();
        System.out.println("SVP Donnez le X de votre point : "+inc);
        in = s.nextInt();
        System.out.println("SVP Donnez le Y de votre point : "+inc);
        in0 = s.nextInt();
        O = new PointName(inc,in,in0);
        System.out.println("svp donnez une valeur à votre x de votre point!");
        in = s.nextInt();
        F.setX(in);
        System.out.println("svp donnez une valeur à y de votre point!");
        in = s.nextInt();
        F.setY(in);

        System.out.println("le 1er point  :"+"\n X ="+F.getX()+"\n Y="+F.getY());
        System.out.println("le 2eme point :");
        P.affichecoord();
        P.deplace(5,5);
        System.out.println("le 2eme point a etait de placee par (5,5) est le nouvelles coordonees sont");
        P.affichecoord();
        System.out.println("le 3eme point :");
        O.affichecoord();
    }

}
