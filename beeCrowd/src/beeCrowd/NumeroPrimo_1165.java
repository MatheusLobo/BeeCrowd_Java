package beeCrowd;

import java.util.Scanner;

public class NumeroPrimo_1165 {

	public static void main(String[] args) {
		int num,entrada,aux=0,primo=0;
		Scanner read = new Scanner (System.in);
		entrada=read.nextInt();
		while (aux!=entrada) {
			aux++;
			num=read.nextInt();
			
			for (int j=1;j<=num;j++) {
				if (num%j==0) {
					primo++;
					
				}
			}
			if (primo==2) {
				System.out.println(num+" eh primo");
			} else System.out.println(num+" nao eh primo");
			primo=0;
		}
		

	}

}
