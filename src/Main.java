
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Carlos","Gutierrez",23456345,25000);
        Employee employee2 = new Employee("Ana","Sanchez",34234123,27500);
        System.out.println("Date\n"+employee1.toString());
        System.out.println("Date\n"+employee2.toString());
        employee1.increaseSalary(15);
        System.out.println("Date\n"+employee1.toString());
        employee1.calculateAnnualSalary();
    }
}