package beeCrowd;

import java.util.Scanner;

public class FibonacciFacil_1151 {
    public static void main(String[] args) {
        int n=0;
        int fib1=0;
        int fib2=0;
        int fib3=0;
        int b=0;
  
        Scanner input = new Scanner (System.in);
        n=input.nextInt();

        while (b!=n) {

            fib3=fib1+fib2;
            fib1=fib2;
            System.out.print(fib3+" ");
            fib2=fib3;
            b++;

            if (b==n) {
                System.out.println();
                break;}
            if (fib1==0 && fib2==0 && fib3==0) {
            	fib1=1;
            }
            }
        }
    }

