package ro.teamnet.zerotohero.oop.graphicshape.runApp;

import ro.teamnet.zerotohero.oop.graphicshape.*;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class RunApp {
    public static void main(String[] args) {
        Circles c2 = new Circles();
        System.out.println("The default circle area is "+ c2.getAreaPub());

        c2.getAreaDef();
       /* Canvas can = new Canvas();
        can.paint();*/
       Shape s1 = new Circle(10);
        System.out.println("Area is " + s1.area());

        ShapeBehaviour sb1 = new Square(10);
        System.out.println("Area is: " + sb1.area());
        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));

        Persoana per = new Persoana(10);
        System.out.println(per.getVarsta());
    }
}
