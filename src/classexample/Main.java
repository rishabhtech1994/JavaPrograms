package classexample;

public class Main {
    public static void main(String[] args) {
        Account acc =new Account();
        acc.depositFund(200);
        acc.withdrawFund(500);

        Account acc1 =new Account();
        acc1.depositFund(3453);
        acc1.withdrawFund(658);
    }
}
