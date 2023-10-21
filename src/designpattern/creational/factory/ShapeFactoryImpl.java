package designpattern.creational.factory;

public class ShapeFactoryImpl implements IShapeFactory{
    @Override
    public void getShape(String shape) {
        switch (shape){
            case "Rectangle": {
                 Rectangle rec = new Rectangle(3.45, 43.45);
                 rec.printArea(rec.getShapeArea());
                 break;
            }
            case "Square" : {
                Square square = new Square(12.34);
                square.printArea(square.getShapeArea());
                break;
            }
            case "Circle" :{
                Circle circle = new Circle(23.45);
                circle.printArea(circle.getShapeArea());
                break;
            }
            default:{
                System.out.println("No Such shape available called "+shape );
            }
        }
    }
}
