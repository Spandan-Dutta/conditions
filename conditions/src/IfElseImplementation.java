/* Accept a number from user and check whether the given number is even or odd */

import java.util.Scanner;

public class IfElseImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is not even");
        }
        s.close();
    }

}
