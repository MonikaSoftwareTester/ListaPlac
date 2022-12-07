package homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan","Nowak",2000);
        Employee employee2 = new Employee("Robert","Kowal",3000);
        Employee employee3 = new Employee("Michał","Nowaczyk",4000);
        Employee employee4 = new Employee("Adam","Dobroczyk",5000);
        Employee employee5 = new Employee("Janusz","Mikrut",6000);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);

        company.printEmployees();
        System.out.println("Total salary of all employees: "+ company.getSum());
        System.out.println("Average salary of all employees: " + company.getAvr());
    }
}
