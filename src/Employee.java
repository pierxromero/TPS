public class Employee {
    ///Atributos
    private String name;
    private String lastName;
    private double salary;
    private int dni;
    ///Constructores
    public Employee(String nombre, String lastName, int dni, double salario) {
        this.name=nombre;
        this.lastName = lastName;
        this.dni=dni;
        this.salary=salario;
    }
    public Employee(){
        this.name = "Desconocido";
        this.lastName = "Desconocido";
        this.salary = 0;
        this.dni = 0;
    }
    ///Metodos
    public String getNombre() {return name;}
    public String getLastName() {return lastName;}
    public int getDni() {return dni;}
    public double getSalario() {return salary;}
    public void setNombre(String nombre) {this.name = nombre;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setSalario(double salario){this.salary=salario;}
    public void setDni(int dni){this.dni=dni;}

    public void calculateAnnualSalary(){
        double salaryAnnual=salary*12;
        System.out.printf("The annual salary is %.2f",salaryAnnual);
    }

    public void increaseSalary(int increase){
        double result = (salary*increase)/100;
        salary+=result;
    }

    @Override
    public String toString() {
        return "Employee:" + "DNI='" + dni + '\'' + ", Name='" + name + '\'' +
                ", Last Name=" + lastName +
                ", Salary=" + salary;
    }
}
