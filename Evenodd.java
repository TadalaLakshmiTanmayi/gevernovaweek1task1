import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        // enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
        scanner.close();
    }
}
