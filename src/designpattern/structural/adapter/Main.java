package designpattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        AndroidCharger charger = new AndroidTypeCCharger();
        //Apple charger is taking the Android charger as input inside the adapter and providing impl of the Apple charger
        // This is the use of teh adapter class
        AppleCharger appleCharger = new AdapterCharger(charger);
        appleCharger.chargeApplePhone();
    }
}
