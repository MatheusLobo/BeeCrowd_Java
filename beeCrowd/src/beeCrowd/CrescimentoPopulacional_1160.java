package beeCrowd;

import java.util.Scanner;

public class CrescimentoPopulacional_1160 {

	public static void main(String[] args) {
		int T,contador=0,ano=0;
		int PA,PB,PAF,PBF;
		double G1,G2;
		

		Scanner read = new Scanner (System.in);
		T=read.nextInt();
		while (true) {
			
			PA= read.nextInt();
			PB= read.nextInt();
			G1= read.nextDouble();
			G2= read.nextDouble();
			
			PAF=PA;
			PBF=PB;
				
			 while (true) {
				
				PAF= (int) (PAF+(PAF*(G1/100)));
				PBF= (int) (PBF+(PBF*(G2/100)));
				ano++;
				if (ano>100) {
					System.out.println("Mais de 1 seculo.");
					ano=0;
					break;
				}
				if (PAF>PBF && ano<=100) {
					System.out.println(ano+" anos.");
					ano=0;
					break;
				}
				
			
		
			
		}
				contador++;
			if (contador==T) {
				break;
			}
		
	}

}
}
