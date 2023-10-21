package designpattern.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3= Singleton.getInstance();
        // to upper case
        s1.name = (s1.name).toUpperCase();
        System.out.println("String s1: "+ s1.name);
        System.out.println("String s2: "+ s2.name);
        System.out.println("String s3: "+ s3.name);
        System.out.println("\n");

        // To lower case
        s3.name = (s3.name).toLowerCase();
        System.out.println("String s1: "+ s1.name);
        System.out.println("String s1: "+ s1.name);
        System.out.println("String s1: "+ s1.name);
    }
}

class Singleton{
    private static Singleton single_instance =  null;
    public String name;
    //Private constructor
    private Singleton(){
        name = "Rishabh";
    }
    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
