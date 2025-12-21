public class FinalLabTask4 {

// Abstract class
abstract class Employee {
    String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Subclass
class FullTimeEmployee extends Employee {
    double monthlySalary;

    // Constructor
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    // Implement abstract method
    double calculateSalary() {
        return monthlySalary;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee emp = new FullTimeEmployee("Redoy", 30000);

        emp.showDetails();
        System.out.println("Monthly Salary: " + emp.calculateSalary());
    }
}