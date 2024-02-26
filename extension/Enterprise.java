package lesson10.extension;

public class Enterprise {
    public static void main(String[] args) {
        Employee e1 = new Employee("Max Kotkov", 1_300);
        System.out.println("max salary: " + e1.calculateSalary());

        Manager m1 = new Manager("Luk Semenov", 1_200, 1.2);
        System.out.println("Luk Semenov: " + m1.calculateSalary());

        Employee m2 = new Manager("Nuka Skorobogatova", 1_100, 1.4);
        System.out.println("Nuka Skorobogatova: " + m2.calculateSalary());


        //HOMEWORK
        //#1
        HourlyBasedEmployee hourlyM1_1 = new HourlyBasedEmployee(m1.getName(), m1.getBaseSalary(), 180);
        System.out.println(hourlyM1_1.calculateSalary());
        HourlyBasedEmployee hourlyM1_2 = new HourlyBasedEmployee(m1.getName(), m1.getBaseSalary(), 90);
        System.out.println(hourlyM1_2.calculateSalary());
        HourlyBasedEmployee hourlyM1_3 = new HourlyBasedEmployee(m1.getName(), m1.getBaseSalary(), 360);
        System.out.println(hourlyM1_3.calculateSalary());
        //#2
        System.out.println(m1.toString());
        System.out.println(e1.toString());



        printEmployee(
                new Employee("Alex", 1100) {
                    public void test() {
                    }
                }
        );

    }

    public static void printEmployee(Employee e) {

    }
}
