package designpattern.structural.adapter;

public class ThunderCharger implements AppleCharger{
    @Override
    public void chargeApplePhone() {
        System.out.println("Apple phone is charging from thunder charger");
    }
}
