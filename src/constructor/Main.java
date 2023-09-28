package constructor;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rishi", 13223, "abc@gmail.com");
        System.out.println("Name "+customer.getName());
        System.out.println("Credit Limit "+customer.getCreditLimit());
        System.out.println("email "+customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println("Name "+secondCustomer.getName());
        System.out.println("Credit Limit "+secondCustomer.getCreditLimit());
        System.out.println("email "+secondCustomer.getEmail());


        Customer thirdCustomer = new Customer("RishabhGupta", "rishabh@outlook.com");
        System.out.println("Name "+thirdCustomer.getName());
        System.out.println("Credit Limit "+thirdCustomer.getCreditLimit());
        System.out.println("email "+thirdCustomer.getEmail());

    }
}
