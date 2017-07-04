package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class Point3d extends Point {
    private int zPos;

    Point3d(int xPos,int yPos, int zPos){
        super(xPos, yPos);
        this.zPos =zPos;
    }
}
