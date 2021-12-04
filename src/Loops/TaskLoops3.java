/*program (with Scan class for input) inputs any positive integer number and
outputs the sum of all numbers from 1 to the entered number.*/

package Loops;

import java.util.Scanner;

public class TaskLoops3<i> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n > 0){
            for (int i = 1 ; i <= n ; i++){
                sum += i;
            }
            System.out.println(sum);
            scanner.close();
        }
    }
}
