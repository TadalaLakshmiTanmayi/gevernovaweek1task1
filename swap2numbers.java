import java.util.Scanner;

public class swap2numbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        //enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        //enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // Display the numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        scanner.close();
    }
}
