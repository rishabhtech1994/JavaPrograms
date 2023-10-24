package designpattern.structural.decorator;

public class CheeseBurst extends ToppingDecorator{
    BasePizza basePizza;
    public CheeseBurst(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 100;
    }
}
