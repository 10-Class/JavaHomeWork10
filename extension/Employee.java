package lesson10.extension;

import lesson10.HourlyEmployee;

public class Employee {
    private String name;
    private double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private void hello(){
        System.out.println("Hello");
    }

    protected void ping() {
        System.out.println("ping: " + name);
    }

    //HOMEWORK
    @Override
    public String toString() {
        return "Employee: " +
                name +
                ", baseSalary: " + baseSalary;
    }
}
