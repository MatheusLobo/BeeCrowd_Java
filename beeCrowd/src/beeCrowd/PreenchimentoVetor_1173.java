package beeCrowd;

import java.util.Scanner;

public class PreenchimentoVetor_1173 {

		public static void main(String[] args) {
			int[] vetor= new int[10];
			Scanner read = new Scanner (System.in);
			int valor;
			valor=read.nextInt();
			vetor[0]=valor;
			for (int i=0;i<9;i++) {
				
				vetor[i+1]=vetor[i]*2;
			}
			for (int i=0;i<10;i++) {
				System.out.println("N["+i+"] = "+vetor[i]);
			}
			
		}

	}
