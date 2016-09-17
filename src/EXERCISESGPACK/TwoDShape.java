package EXERCISESGPACK;

/**
 * Created by dip17_000 on 17.06.2016.
 */
abstract class TwoDShape{
    private double height;
    private double weight;
    private String colour;

    static void bitch(){
        System.out.println("YO,BITCH");
    }

    TwoDShape(double height,double weight){
        this.height = height;
        this.weight = weight;
    }
    TwoDShape(String colour){
        this.colour = colour;
    }

    abstract void getarea();
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        if(height > 0)
            this.height = height;
        else
            System.out.println("WRONG VALUE");
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if(height > 0)
            this.weight = weight;
        else
            System.out.println("WRONG VALUE");
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}
