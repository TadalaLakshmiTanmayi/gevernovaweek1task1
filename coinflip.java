import java.util.Scanner;
public class coinflip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Keep asking for input until a valid positive integer is provided
        int numflips;
        while (true) {
            System.out.println("Enter a positive integer:");
            if (sc.hasNextInt()) {
                numflips = sc.nextInt();
                if (numflips > 0) {
                    break; // exit the loop if the input is valid
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // clear the invalid input
            }
        }
        sc.close();

        // Call the helper method with the valid number of flips
        helper(numflips);
        
    }
    public static void helper(int numflips){
        int heads=0;
        int tails=0;
        for(int i=0;i<numflips;i++){
            if(Math.random()<0.5){
                tails++;
            }else{
                heads++;
            }
        }
        double headspercentage=(double)heads/numflips*100;
        double tailspercentage=(double)tails/numflips*100;
        System.out.println("percentage of heads"+headspercentage);
        System.out.println("percentage of tails"+tailspercentage);

    }
}
