// program accepts input number and outputs a message saying whether the number is even or not.

package Conditionals;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(("Enter a number"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0 ){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();
    }
}

