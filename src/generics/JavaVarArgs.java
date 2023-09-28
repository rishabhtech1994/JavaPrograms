package generics;

import java.util.Arrays;

public class JavaVarArgs {
    public static void printElements(String... arr){
        for(String ar: arr){
            System.out.println("arr = " + ar);
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"rishabh", "Shruti", "amma", "mummy", "papa"};
        String item1 = "abcd";
        String item2 = "efgh";
        String item3 = "ijkl";
        String item4 = "mnop";
        String item5 = "qrst";
        printElements(strArr);
        //varargs allows to add n number of elements
        printElements(item1, item2, item3, item4, item5);
    }
}
