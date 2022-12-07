package homework;

import java.util.List;

public class Company {

    private List<Employee> employeesList;

    public Company(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void printEmployees() {
        for (Employee employee : employeesList) {
            employee.getAllData();
        }
    }

    public int getSum() {
        int total = 0;
        for (Employee employee : employeesList) {
            total += employee.getSalary();
        }
        return total;
    }

    public int getAvr() {
        return getSum()/employeesList.size();
    }
}
