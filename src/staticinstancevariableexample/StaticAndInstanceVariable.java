package staticinstancevariableexample;

public class StaticAndInstanceVariable {
    //Static variables
    private static String name;

    //Instance Variables
    //private String name;

    public StaticAndInstanceVariable(String name){
        StaticAndInstanceVariable.name = name;
    }

    public void printDogName(){
        System.out.println("Dog name is "+name);
    }

    public static void main(String[] args) {
        StaticAndInstanceVariable rani = new StaticAndInstanceVariable("rani");
        //This will change the name to kallu in the static variable
        StaticAndInstanceVariable kaalu = new StaticAndInstanceVariable("kallu");
        rani.printDogName();  // kallu for static variables and rani for instance variables
        kaalu.printDogName(); //kallu
    }
}
