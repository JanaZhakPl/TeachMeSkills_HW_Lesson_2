// program outputs the first 10 numbers of the sequence 0, -5,-10,-15...

package Loops;

public class TaskLoops5 {

    public static void main(String[] args) {
       int n = 0;
       for (int i = 0 ; i < 10 ; i++){
           n-=5;
           System.out.println(n);
       }
    }
}
