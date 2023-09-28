package inheritanceexample;

public class HourlyEmployee extends Employee {

    public double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long empID, String hireDate) {
        super(name, birthDate, empID, hireDate);
    }


    public void getDoublePay(){
        System.out.println("Got double pay");
    }

}
