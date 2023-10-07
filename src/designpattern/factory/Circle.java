package designpattern.factory;

public class Circle implements IShareArea {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getShapeArea() {
        return  Math.PI * radius * radius;
    }
    @Override
    public void printArea(double area) {
        System.out.println(" Area of Circle is " + area);
    }
}
