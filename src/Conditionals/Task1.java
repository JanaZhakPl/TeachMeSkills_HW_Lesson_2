// program outputs the name of a season by the month number using the operator switch-case.

package Conditionals;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(("Enter a number of month"));
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Enter a valid value");
        }
        scanner.close();
    }
}

