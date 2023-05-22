package beeCrowd;

import java.util.Scanner;
public class FibonacciFacil_1151 {
	    public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int n = read.nextInt();
	        int a=0;
	        int b=1;
	        for (int i=0;i<n;i++) {
	            if (i>0) {
	                System.out.print(" ");
	            }
	            System.out.print(a);
	            int temp=a+b;
	            a=b;
	            b=temp;
	        }
	        System.out.println();
	    }
	  }