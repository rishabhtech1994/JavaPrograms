package generics;

public class GenericMethods {

    public static <E> void printArrayMethod(E[] arrays){
        for (E arr : arrays){
            System.out.println("Array List " +arr);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray= {0,1,2,3,4,5,6,7,8};
        Character[] charArray = {'a', 'c','e','r'};
        printArrayMethod(intArray);
        printArrayMethod(charArray);

    }
}
