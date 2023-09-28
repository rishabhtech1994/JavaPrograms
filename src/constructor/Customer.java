package constructor;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    //Constructor
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        //This is constructor chaining
        this("Rishabh", "rishabh@gmail.com");
    }


    public Customer(String name, String email) {
        this(name, 12345, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
