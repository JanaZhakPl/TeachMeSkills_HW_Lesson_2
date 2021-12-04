/* program outputs the message:
    if t>–5, output «Warm»
	if –5>= t > –20 output «Normal»
	if –20>= t output «Cold» */

package Conditionals;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(("Enter the temperature"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t > - 5){
            System.out.println("Warm");
        }  else if (t <= -5 && t > -20){
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scanner.close();
    }
}
