import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        while (true) {
            System.out.println("Enter an year:");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year>999 && year <=9999) {
                    break; // exit the loop if the input is valid
                } else {
                    System.out.println("Please enter a 4 digit number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // clear the invalid input
            }
        }
        sc.close();
        if(isleapyear(year)){
            System.out.println("year:"+year+" is a leap year");
        }else{
            System.out.println("year:"+year+" is not a leap year"); 
        }
    }

    private static boolean isleapyear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }
        return false;
    }
}

