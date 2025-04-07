package EmployeesVacation;

public abstract class Employee
{

    private float vacationDays = 0f;
    private int totalWorkedDays = 0;
    private final int WORK_YEAR_DAYS = 260;

    public float getVacationDays() {
        return vacationDays;
    }

    protected abstract float getVacationRatePerDay();

    public void work(int days) {
        if (days < 0 || (totalWorkedDays + days) > WORK_YEAR_DAYS) {
            System.out.println("Invalid no of work days");
        }

        totalWorkedDays += days;
        vacationDays += days * getVacationRatePerDay();
    }

    public void takeVacation(float days) {
        if (days < 0 || days > vacationDays) {
            System.out.println("Not enough vacation days.");
        }

        vacationDays -= days;
    }

    public int getTotalWorkedDays() {
        return totalWorkedDays;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " | Worked Days: " + totalWorkedDays + ", Vacation Days: " + vacationDays;
    }





}
