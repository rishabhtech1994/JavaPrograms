package referenceobjectsexample;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        System.out.println("First House " +blueHouse.getColor());
        System.out.println("Another House " +anotherHouse.getColor());

        /****
         * Changing the color from another class with difference reference pointing same object
         * ****/
        anotherHouse.setColor("yellow");
        System.out.println("First House Changed " +blueHouse.getColor());
        System.out.println("Another House Changed " +anotherHouse.getColor());


        House thirdHouse = new House("black");
        //Changed the reference
        anotherHouse = thirdHouse;
        System.out.println("First House Changed " +blueHouse.getColor());
        System.out.println("Another House Changed " +anotherHouse.getColor());
        System.out.println("Third House Changed " +thirdHouse.getColor());
    }
}
