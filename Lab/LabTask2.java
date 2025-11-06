import java.util.*;
public class LabTask2{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== problem 2: Discount Calculator ===");
        double originalPrice = 250.0;
        double discountPercent = 15.0;
        double discountAmount = originalPrice * (discountPercent / 100.0);
        double finalPrice = originalPrice - discountAmount;
        System.out.printf("Original Price:$%.2f\n", originalPrice);
        System.out.printf("Discount (15%%): $%.2f\n", discountAmount);
        System.out.printf("Final price: $%.2f\n\n:", finalPrice);

        scanner.close();
    }
}

