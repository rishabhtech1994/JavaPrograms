package generics;


//Add teh Generic after the class as parameter
//more parameters can be added in comma separation
public class GenericClass<T> {
    public T t;
    void add(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerGenericObject = new GenericClass<>();
        GenericClass<String> stringGenericObject = new GenericClass<>();

        integerGenericObject.add(20);
        stringGenericObject.add("Rishabh");

        System.out.println("Integer Generic class "+ integerGenericObject.getT());
        System.out.println("String Generic class "+ stringGenericObject.getT());

    }

}

