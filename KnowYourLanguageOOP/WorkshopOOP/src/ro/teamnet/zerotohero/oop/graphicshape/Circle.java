package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Andreea.Puscasu on 7/4/2017.
 */
public class Circle extends Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle() {
        this.xPos = 1;
        this.yPos = 2;
        this.radius = 4;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public Circle(int xPos){
        this.xPos = xPos;
    }
    public Circle(int xPos,int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

    }
   public Circle(int xPos,int yPos,int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;

    }



    @Override
    public String toString() {
        return  "center = (x,y) " + (xPos+yPos)+ "radius =z "+ radius;
    }

    public void fillColour(){
        System.out.println(super.color);
    }
    public void fillColour(int color){
        super.setColor(3);

        System.out.println("The circle color now is "+ super.color);
    }
    public void fillColout(float saturation){
        super.setSaturation((float) 4.4);

    }

}

