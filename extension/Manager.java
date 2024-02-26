package lesson10.extension;

public class Manager extends Employee {
    private double performance; // бонус за выполнение плана

    public Manager(String name, double baseSalary, double performance) {
        super(name, baseSalary);
        this.performance = performance;
    }

    @Override
    public double calculateSalary() {
        ping();
        return getBaseSalary() * performance;
    }

    //HOMEWORK
    @Override
    public String toString() {
        return "Manager: " +
                getName() +
                ", baseSalary: " + getBaseSalary();
    }
}
