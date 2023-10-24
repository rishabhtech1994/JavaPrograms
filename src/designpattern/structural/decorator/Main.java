package designpattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = (new PeriPeriChicken(new ExtraCheese(new FarmHouse())));
        System.out.println("Base Pizza" + basePizza.cost());

        BasePizza basePizza1 =  new PeriPeriChicken(new CheeseBurst(new Margherita()));
        System.out.println("Base Pizza 1" +basePizza1.cost());

        BasePizza basePizza2 =  new ExtraCheese(new MexicanGreenWave());
        System.out.println("Base Pizza 1" +basePizza2.cost());
    }


}
