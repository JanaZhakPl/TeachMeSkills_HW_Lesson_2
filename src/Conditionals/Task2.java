// program outputs the name of a season by the month number using the operator if-else-if.

package Conditionals;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(("Enter a number of month"));
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        }else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Enter a valid value");
        }
        scanner.close();
    }
}

