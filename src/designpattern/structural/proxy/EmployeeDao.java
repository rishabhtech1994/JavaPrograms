package designpattern.structural.proxy;

public interface EmployeeDao {
    void create(String client , Employee emp) throws Exception;
    void delete(String client , int id) throws Exception;
    Employee getEmp(String client , Employee emp) throws Exception;

}
