// program outputs  the squares of numbers from 10 to 20

package Loops;

public class TaskLoops6 {

    public static void main(String[] args) {
        int x = 10;

        while(x <= 20){
            int squareNumber = x*x;
            x++;
            System.out.print(squareNumber + " ");
        }
    }


}
