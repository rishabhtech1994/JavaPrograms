package designpattern.structural.proxy;

public class EmployeeDaoProxyImpl implements EmployeeDao{
    EmployeeDao employeeDao;

    EmployeeDaoProxyImpl(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee emp) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client, emp);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.delete(client, id);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public Employee getEmp(String client, Employee emp) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDao.getEmp(client, emp);
        }
        throw new Exception("ACCESS DENIED");
    }
}
