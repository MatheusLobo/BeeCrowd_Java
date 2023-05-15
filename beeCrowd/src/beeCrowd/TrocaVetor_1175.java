package beeCrowd;

import java.util.Scanner;

public class TrocaVetor_1175 {


		public static void main(String[] args) {
			int[] vetor= new int[20];
			int aux1,aux2,i=0,j=0;
			
			Scanner read = new Scanner (System.in);
			for (i=0;i<=19;i++) {
				vetor[i]=read.nextInt();
			}
			i=0;
			j=19;
			reverse(vetor);
				
			
			
			
			i=0;
			
			for ( i=0;i<=19;i++) {
				System.out.println("N["+i+"] = "+vetor[i]);
			}
	}

		public static int[] reverse(int[] vetor) {
			int i=0,aux,aux2;
			int j=19;
			while (true) {
				aux=vetor[i];
				aux2=vetor[j];
				vetor[i]=aux2;
				vetor[j]=aux;
				i++;
				j--;
				if (i==9) {
					aux=vetor[9];
					aux2=vetor[10];
					vetor[9]=aux2;
					vetor[10]=aux;
					
					break;
				}
			}
			return vetor;
		}
}
