package EmployeesVacation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {


    private final List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
        // Create 10 employees
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployee());
            employees.add(new SalariedEmployee());
            employees.add(new Manager());
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void work(int employeeIndex, int days) {
        Employee employee = employees.get(employeeIndex);
        employee.work(days);
    }

    public void takeVacation(int employeeIndex, float days) {
        Employee employee = employees.get(employeeIndex);
        employee.takeVacation(days);
    }

    public void printAllEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("ID " + i + ": " + employees.get(i));
        }
    }


    public static void main(String[] args) {


        EmployeeController controller = new EmployeeController();

        controller.work(0, 100); // Hourly employee
        controller.work(10, 200); // Salaried employee
        controller.work(20, 260); // Manager

        controller.takeVacation(20, 10); // Manager with vacation

        controller.printAllEmployees();

    }
}

