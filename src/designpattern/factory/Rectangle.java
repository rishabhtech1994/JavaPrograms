package designpattern.factory;

public class Rectangle implements IShareArea{

    private final double length;
    private final double breadth;
    public Rectangle(Double length , Double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getShapeArea() {
        return  length * breadth;
    }

    @Override
    public void printArea(double area) {
        System.out.println("Area of Rectangle: "+ area);
    }

}
