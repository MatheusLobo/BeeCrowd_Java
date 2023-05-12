package beeCrowd;

import java.util.Scanner;

public class Divisores_1157 {
	public static void main(String[] args) {
		
		int n,i;
		Scanner scn = new Scanner (System.in);
		n=scn.nextInt();
		i=0;
		for (i=1;i<=n;i++) {
			if (n%i==0){
			System.out.println(i);
		}
		}
		
	}
}
