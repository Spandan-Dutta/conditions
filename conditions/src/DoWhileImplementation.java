/* Create an application called Magical Number.
This application will ask user to enter a number and you will match that number with your
selected magical number, if matched than user wins, if not user will try again,
user have the option to exit by pressing 0.
 */

import java.util.Scanner;

public class DoWhileImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to magical number game");
        int magicalNumber = 69;
        int number;
        do {
            System.out.println("Enter a positive integer.Press 0 to exit");
            number = s.nextInt();
            if (number == magicalNumber) {
                System.out.println("you won the game");
                break;
            } else if (number != 0) {
                System.out.println("Try again");
            }
        }
        while (number != 0);
        System.out.println("Thank You");
    }
}
