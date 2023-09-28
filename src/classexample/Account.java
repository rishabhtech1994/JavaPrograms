package classexample;

public class Account {
    private String customerName = "Rishabh";
    private String customerPhone = "1234567890";
    private String customerBankAcc = "2455465757";
    private double customerAccBalance = 5000;
    private String customerEmail= "rishabh@gmail.com";

    //Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerBankAcc() {
        return customerBankAcc;
    }

    public double getCustomerAccBalance() {
        return customerAccBalance;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    //Setter Methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerBankAcc(String customerBankAcc) {
        this.customerBankAcc = customerBankAcc;
    }

    public void setCustomerAccBalance(double customerAccBalance) {
        this.customerAccBalance = customerAccBalance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /** Deposit Fund Function
     *  Input : amount to be deposit. Print the balance
     **/
    public void depositFund(double fund){
        customerAccBalance += fund;
        System.out.println("Deposit amount RS" +fund +"balance is $"+customerAccBalance);
    }

    /** Withdraw Fund Function
     *  Input : amount to be withdrawn. Print the balance and check the insufficient balance amount
     **/
    public void withdrawFund(int withdrawAmount){
        if(customerAccBalance - withdrawAmount < 0){
            System.out.println("Insufficient balance in account");
        }else {
            customerAccBalance -= withdrawAmount;
            System.out.println("Available balance is "+customerAccBalance);
        }
    }
}
