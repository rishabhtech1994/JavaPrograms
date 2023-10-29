package designpattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxyImpl();
            employeeDao.create("ADMIN", new Employee());

            // Exception case
            employeeDao.create("USER", new Employee());

            //Delete Employee
            employeeDao.delete("ADMIN", 10);

            //Exception case
            employeeDao.getEmp("QBVC", new Employee());

            System.out.println("Operation successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
