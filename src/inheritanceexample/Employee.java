package inheritanceexample;

public class Employee extends Worker{
    public long empID;
    public String hireDate;

    public Employee(String name, String birthDate, long empID , String hireDate) {
        super(name, birthDate);
        this.empID = empID;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
