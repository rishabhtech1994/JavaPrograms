package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    // Adding the Elements to the Generic list and

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Rishabh");
        myList.add("Gupta");
        String firstName = myList.get(0);
        String lastName = myList.get(1);
        System.out.println("First Name is " + firstName);
        System.out.println("Last Name is " + lastName);

        //This will create a compile time error as there List of the generic String
        //myList.add(5)
    }
}
