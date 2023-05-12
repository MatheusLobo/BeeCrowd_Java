package beeCrowd;

import java.util.Scanner;

public class FatorialSinmples_1153 {
	public static void main(String[] args) {
		
		int n;
		int aux=1;
		Scanner input = new Scanner (System.in);
		n=input.nextInt();
		aux=n;
		for (int i=1;i<n;i++) {
			aux=aux*(n-i);
		}
			System.out.println(aux);
	}
	
		
}
