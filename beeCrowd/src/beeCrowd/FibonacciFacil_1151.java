package beeCrowd;

import java.util.Scanner;
public class FibonacciFacil_1151 {
    public static void main(String[] args) {
        int fib0 = 0, fib1 = 1;
        int fib2 = 0, n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();

        while (n != 0) {
            System.out.print(fib0);
            fib2 = fib1 + fib0;
            fib0 = fib1;
            fib1 = fib2;
            if (n != 1) {
                System.out.print(" ");
            }
            n--;
        }

        read.close();
    }
}