import java.util.Scanner;

public class quotientremainder {
    public static void main(String[] args) {
        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        // enter the dividend and divisor
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        if(divisor==0){
            System.out.print("ArithmeticException: Enter a non zero value: ");
            divisor = scanner.nextInt();
        }
        // Compute the quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        scanner.close();
    }
}
