//program outputs the name of colour according to the number

package Conditionals;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(("Enter a number of rainbow`s color"));
        Scanner scanner = new Scanner(System.in);
        int colour = scanner.nextInt();

        switch (colour) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("There are only seven colours of the rainbow");
        }
        scanner.close();
    }
}
