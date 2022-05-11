package spring_employee_accounting.dao;

import spring_employee_accounting.entity.Employee;;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> getTop10Salary();
}
