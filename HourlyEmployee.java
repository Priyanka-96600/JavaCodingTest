package EmployeesVacation;

public class HourlyEmployee extends Employee {
    @Override
    protected float getVacationRatePerDay() {
        return 10f / 260f;
    }
}
