package designpattern.structural.adapter;

public class AndroidTypeCCharger implements AndroidCharger {
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Android Phone is charging using Type C Charger");
    }
}
