public class MortgageCalculator {

   public static void main(String[]args) {
     scanner input = new scanner(System.in);

     // input principal,interest,and years
     System.out.print(Enter loan amount (p):)");
     double p = input.nextint();

    System.out.println(x:"Enter the loan term in years:");

     //mortage formula
     System.out.println(x:"double M = p*(r*Math.pow(1 + r,n))/
     (Math.pow(1 +r,n) - 1);
     
     // Display result
     System.out.println(x:"\nMonthly Payment (M):%.2f\n",M);
     
     input.close();
   }
   



    
}
