import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bangladesh Mortgage 2Calculator");

        double salary = getNumber(scanner, "Enter Salary: ");

        int creditScore = (int) getNumber(scanner, "Enter Credit Score (0-500): ");
        while (creditScore < 0 || creditScore > 500) {
            System.out.println("Credit Score must be between 0 and 500.");
            creditScore = (int) getNumber(scanner, "Enter Credit Score (0-500): ");
        }

        boolean criminalRecord = getBoolean(scanner, "Criminal Record (true/false): ");

        if (creditScore < 300) {
            System.out.println("Not eligible: Credit score below 300.");
            scanner.close();
            return;
        }
        if (criminalRecord) {
            System.out.println("Not eligible: Criminal record present.");
            scanner.close();
            return;
        }

        double maxLoan = salary * 2;
        System.out.println("Maximum loan amount: " + maxLoan);

        double principal = getNumber(scanner, "Enter Principal Loan Amount: ");
        while (principal >= maxLoan) {
            System.out.println("Loan must be less than " + maxLoan);
            principal = getNumber(scanner, "Enter Principal Loan Amount: ");
        }

        double rate = 0.10; // 10% annual
        int years = 10;
        int months = years * 12;
        double monthlyRate = rate / 12;

        double emi;
        if (monthlyRate == 0) {
            emi = principal / months;
        } else {
            emi = principal * monthlyRate * Math.pow(1 + monthlyRate, months)
                  / (Math.pow(1 + monthlyRate, months) - 1);
        }

        double total = emi * months;
        double interest = total - principal;

        System.out.println("\nMortgage Details");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: 10%");
        System.out.println("Tenure: 10 years");
        System.out.println("Monthly EMI: " + String.format("%.2f", emi));
        System.out.println("Total Payment: " + String.format("%.2f", total));
        System.out.println("Total Interest: " + String.format("%.2f", interest));
        System.out.println("Loan approved.");

        scanner.close();
    }

    private static double getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value >= 0) return value;
                System.out.println("Enter a non-negative number.");
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static boolean getBoolean(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Enter true or false.");
        }
    }
}


     
     
     

