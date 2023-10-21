package designpattern.prototypedesignpattern;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Create the First object Object ");
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.setDatabasePort("124");
        databaseConnection.fetchVeryLargeData();

        System.out.println(databaseConnection);

        // we will create the clone of the Database Connection object again and not create a new one.

        try {
            System.out.println("Create the Object as per the Prototype Design pattern");
            DatabaseConnection databaseConnection1 =(DatabaseConnection) databaseConnection.clone();
            System.out.println(databaseConnection1);
            //As clone is the function of the Object class we need to type cast it to the Object we need to make the clone of.
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
