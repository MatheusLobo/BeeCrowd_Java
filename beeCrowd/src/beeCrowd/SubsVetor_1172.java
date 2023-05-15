package beeCrowd;

import java.util.Scanner;

public class SubsVetor_1172 {

	public static void main(String[] args) {
		int[] vetor= new int[10];
		Scanner read = new Scanner (System.in);
		
		for (int i=0;i<10;i++) {
			vetor[i]=read.nextInt();
		}
		for (int i=0;i<10;i++) {
			if (vetor[i]<=0) {
				vetor[i]=1;
			}
		}
		for (int i=0;i<10;i++) {
			System.out.println("X["+i+"] = "+vetor[i]);
		}
	}

}
