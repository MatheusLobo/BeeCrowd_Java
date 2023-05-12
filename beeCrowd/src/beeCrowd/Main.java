package beeCrowd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int m = 1;
		int aux = 0;
		int soma = 0;
		int n = 1;
		int j = 0;
		int i = 1;
		
		Scanner input = new Scanner(System.in);
		
		while (i != 0) {
			m = input.nextInt();
			n = input.nextInt();
			aux = m;
			
			if (m <= 0 || n <= 0) {
				i = 0;
			} else {
				for (j = 0; j <= Math.abs(m - n); j++) {
					soma = soma + aux;
					aux = aux + 1;
				}
			}
		}
		j=j-Math.abs(m-n);
		for (int h = 0; h <= j; h++) {
			System.out.print((n + h) + " ");	
		}
		
		System.out.println("Sum=" + soma);
	}
}

