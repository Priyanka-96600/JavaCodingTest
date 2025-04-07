package EmployeesVacation;

public class SalariedEmployee extends Employee {
    @Override
    protected float getVacationRatePerDay() {
        return 15f / 260f;
    }
}
