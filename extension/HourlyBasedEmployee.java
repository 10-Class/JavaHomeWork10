package lesson10.extension;

public class HourlyBasedEmployee extends Employee {
    private int monthlyHours;

    public HourlyBasedEmployee(String name, double baseSalary, int monthlyHours) {
        super(name, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }


    @Override
    public double calculateSalary() {
        double yourSalary = 0;
        double normalHours = 180;
        double salaryOneHours = getBaseSalary() / normalHours;
        yourSalary = getMonthlyHours() * salaryOneHours;
        return yourSalary;
    }

}
