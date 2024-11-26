import java.util.Scanner;
public class primefactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: Number N for which prime factorization is to be found
        System.out.print("Enter a number to find its prime factors: ");
        int N = sc.nextInt();
        // Output: Prime factors of N
        System.out.print("Prime factors of " + N + " are: ");
        primeFactors(N);
        sc.close();
    }
    // Method for computing prime factorization
    public static void primeFactors(int N) {
        // Handle the smallest prime factor, which is 2
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }
        // Handling the odd factors from 3 to sqrt(N)
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
        // If N is a prime number greater than 2
        if (N > 2) {
            System.out.print(N);
        }
    }
}
