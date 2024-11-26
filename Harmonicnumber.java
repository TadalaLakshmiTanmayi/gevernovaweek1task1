import java.util.Scanner;
public class Harmonicnumber {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    // Input: Harmonic value N
    System.out.print("Enter a positive integer N: ");
    int N = sc.nextInt();
    
    // Ensure N is positive
    if (N > 0) {
        // Output the Nth harmonic number
        System.out.println("The " + N + "th harmonic number is: " + harmonicNumber(N));
    } else {
        System.out.println("N must be a positive integer greater than 0.");
    }
    
    sc.close();

    double ans=harmonicNumber(N);
    System.out.println(ans);

   } 
   public static double harmonicNumber(int N) {
    double harmonicValue = 0.0;
    
    // Sum up 1/i for i from 1 to N
    for (int i = 1; i <= N; i++) {
        harmonicValue += 1.0 / i;
    }
    
    return harmonicValue;
}
}

