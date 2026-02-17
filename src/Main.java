import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program prompts user to enter birth month as an integer between 1 and 12
        // Read input with sacnner as age and
        // write age back to screen, if age is not in range of 1 to 12 it writes back that they
        // entered an incorrect month value and writes the value back
        // have to check for bad value first

        int birthMonth = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You entered month: " + birthMonth);
            } else {
                System.out.println("Incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.next();
            System.out.println("You did not enter a valid month: " + trash);
            System.out.println("Run the program again and input a valid value for month!");
        }


    }
}