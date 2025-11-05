import java.util.*;
public class MidLab { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// 1. Combine first and last name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        String fullName = formatFullName(firstName, lastName);
        System.out.println("1. Full Name: " + fullName);
        
        // 2. Generate product code
        System.out.print("\nEnter product name: ");
        String productName = scanner.nextLine();
        
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        
        String productCode = generateProductCode(productName, productId);
        System.out.println("2. Product Code: " + productCode);
        
        // 3. Extract username from email
        System.out.print("\nEnter email address: ");
        String email = scanner.nextLine();
        
        String username = extractUsername(email);
        System.out.println("3. Username: " + username);
        
        // 4. Count characters in message
        System.out.print("\nEnter a message: ");
        String message = scanner.nextLine();
        
        int charCount = countCharacters(message);
        System.out.println("4. Total characters in message: " + charCount);
        
        // 5. Convert sentence to uppercase and lowercase
        System.out.print("\nEnter a sentence to convert: ");
        String sentence = scanner.nextLine();
        
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        System.out.println("5. Uppercase: " + upperCase);
        System.out.println("   Lowercase: " + lowerCase);
        
        // 6. Replace a specific word
        System.out.print("\nEnter a sentence: ");
        String inputSentence = scanner.nextLine();
        
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.nextLine();
        
        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();
        
        String replacedSentence = replaceWord(inputSentence, oldWord, newWord);
        System.out.println("6. After replacement: " + replacedSentence);
        
        scanner.close();  


    
}
