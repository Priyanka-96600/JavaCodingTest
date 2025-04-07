package EmployeesVacation;

public class Manager extends Employee {
    @Override
    protected float getVacationRatePerDay() {
        return 30f / 260f;
    }
}
