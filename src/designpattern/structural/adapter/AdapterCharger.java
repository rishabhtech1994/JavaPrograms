package designpattern.structural.adapter;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger androidCharger;
    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeApplePhone() {
        System.out.println("Apple Phone is charging via adapter");
    }
}
