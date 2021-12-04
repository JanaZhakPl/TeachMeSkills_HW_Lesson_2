//program outputs the first 11 Fibonacci numbers

package Extra;

public class TaskExtra1 {

    public static void main(String[] args) {
       int n = 0;
       int n1 = 1;

        for (int i = 0; i < 11; i++) {
            System.out.print(n1 + " ");

            int n2 = n + n1;
            n = n1;
            n1 = n2;
        }
    }
}