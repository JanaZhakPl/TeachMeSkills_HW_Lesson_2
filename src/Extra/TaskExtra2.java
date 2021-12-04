/*program inputs the values of the deposit and the term
and outputs the deposit amount after the specified term in month, with an interest rate of 7 per cent*/

package Extra;

import java.util.Scanner;

public class TaskExtra2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       float interestRate = 7;

        System.out.println("Enter the deposit value");
        float deposit = scanner.nextFloat();
        System.out.println("Enter the deposit period in month");
        int termInMonth = scanner.nextInt();

        for(int i = 0; i < termInMonth; i++){
            deposit +=  interestRate / 100 * deposit;
        }
        System.out.println(deposit);
        scanner.close();
    }
}
