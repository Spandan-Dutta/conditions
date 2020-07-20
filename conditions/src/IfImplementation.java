/* Accept a number from user, and check if the given number is greater than 50
and inform the user if its greater than 50 */

import java.util.Scanner;

public class IfImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        // control statement
        if (n > 50) {
            System.out.println("You have entered a number greater than 50");
        }
     
    }
}
