package designpattern.structural.decorator;

public class PeriPeriChicken extends ToppingDecorator{
    BasePizza basePizza;
    public PeriPeriChicken(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+ 300;
    }
}
