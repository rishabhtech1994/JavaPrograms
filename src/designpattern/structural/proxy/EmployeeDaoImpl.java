package designpattern.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee emp) throws Exception {
        System.out.println("Created new row!! Employee added");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        System.out.println("Employee Deleted!!");
    }

    @Override
    public Employee getEmp(String client, Employee emp) throws Exception {
        System.out.println("fetch data  from Empl Db");
        return new Employee();
    }
}
