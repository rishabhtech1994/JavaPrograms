package designpattern.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();
        shapeFactory.getShape("Rectangle");
        shapeFactory.getShape("Circle");
        shapeFactory.getShape("Square");
        shapeFactory.getShape("Hexagon");
    }
}
