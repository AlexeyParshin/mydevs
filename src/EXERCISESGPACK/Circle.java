package EXERCISESGPACK;

/**
 * Created by dip17_000 on 17.06.2016.
 */
class Circle extends TwoDShape{
    private double radius;

    public Circle(double radius, String colour){
        super(colour);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void getarea(){
        System.out.println(3.14*radius*radius);
    }

}
