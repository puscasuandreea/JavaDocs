package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class Circles {

    public double getAreaPub(){
        Circle c1 = new Circle();
        return  c1.area();
    }
    public void getAreaDef(){
        Circle c3 = new Circle();
        c3.fillColour();
        c3.fillColour(3);
        c3.fillColour((int) 3.5);
    }
}
