//program outputs the following sequence:7 14 21 28 35 42 49 56 63 70 77 84 91 98 using while-loop

package Loops;

public class TaskLoops4 {

    public static void main(String[] args) {
        int n = 7;
        while (n <= 98){
            System.out.print(n + " ");
            n += 7;
        }
    }
}
