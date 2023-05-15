package beeCrowd;

import java.util.Scanner;

public class SelecaoVetor_1174 {

	public static void main(String[] args) {
		double[] vetor= new double[100];
		Scanner read = new Scanner (System.in);
		for (int i=0;i<=99;i++) {
			vetor[i]=read.nextDouble();
		}
		
		for (int i=0;i<=99;i++) {
			if (vetor[i]<=10) {
				 System.out.println(String.format("A[%d] = %.1f", i, vetor[i]));
			}
		}
		
		
		
	}

}
