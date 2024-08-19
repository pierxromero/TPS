
public class Main {
    public static void main(String[] args) {
        employee employee1 = new employee("Carlos","Gutierrez",23456345,25000);
        employee employee2 = new employee("Ana","Sanchez",34234123,27500);
        System.out.println("Date\n"+employee1.toString());
        System.out.println("Date\n"+employee2.toString());
        employee1.increaseSalary(15);
        System.out.println("Date\n"+employee1.toString());
        employee1.calculateAnnualSalary();
    }
}