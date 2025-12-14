public abstract class LabTask2final {
    public class SimpleCompany {

    // Fixed size arrays
    static String[] names = new String[5];
    static String[] titles = new String[5];
    static double[] salaries = new double[5];
    static int count = 0; // how many employees we have

    public static void addEmployee(String name, String title, double salary) {
        if (count < 5) {
            names[count] = name;
            titles[count] = title;
            salaries[count] = salary;
            count++;
            System.out.println("Added: " + name);
        } else {
            System.out.println("Company is full! Cannot add " + name);
        }
    }

    public static void showAllEmployees() {
        System.out.println("\n--- Tech Company Employees ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + names[i] + 
                             ", Position: " + titles[i] + 
                             ", Salary: $" + salaries[i]);
        }
        System.out.println("Total employees: " + count + "/5\n");
    }

    public static void main(String[] args) {

        // Adding employees
        addEmployee("Ali", "Developer", 70000);
        addEmployee("Sara", "Manager", 90000);
        addEmployee("Omar", "Designer", 65000);
        addEmployee("Lina", "CEO", 150000);

        // Show all
        showAllEmployees();

        // Try to add one more than limit
        addEmployee("Khalid", "Intern", 30000);
        addEmployee("Nora", "Tester", 60000); // This will say full

        showAllEmployees();
    }
}
}
