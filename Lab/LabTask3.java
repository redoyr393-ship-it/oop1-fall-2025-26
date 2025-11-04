import java.util.*;
public class LabTask3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== problem 3: Celcius to Fahrenheit ===");
        System.out.print("Enter temperature in Celcius:");
        double celcius = scanner.nextDouble();
        double fahrenheit = (celcius * 9.0 / 5.0) + 32.0;
        System.out.printf("Temp. in Fahernheit: "+ fahrenheit +(char)176+ "F");
    
}
}
