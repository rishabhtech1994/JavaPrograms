package inheritanceexample;

public class SalariedEmployee extends  Employee{

    public boolean isRetired;

    public double annualSalary;

    public SalariedEmployee(String name, String birthDate, long empID, String hireDate) {
        super(name, birthDate, empID, hireDate);
    }

    public void retire(){
        System.out.println("Retired");
    }


}
