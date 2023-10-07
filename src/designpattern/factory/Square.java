package designpattern.factory;

public class Square implements IShareArea {

    private final double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getShapeArea() {
        return  side * side;
    }

    @Override
    public void printArea(double area) {
        System.out.println("Area of Square: "+ area);
    }
}
