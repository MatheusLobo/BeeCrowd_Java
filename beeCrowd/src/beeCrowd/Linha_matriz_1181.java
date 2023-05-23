package beeCrowd;

import java.util.Scanner;

public class Linha_matriz_1181 {

	public static void main(String[] args) {
		double[][] m = new double[12][12];
		int lin;
		double opera=0;;
		String alt;
		Scanner read = new Scanner(System.in);
		lin=read.nextInt();
		alt=read.next();
		
		for (int i=0; i<12;i++) {
			m[lin][i]=read.nextDouble();
			opera=opera+m[lin][i];
		}
		
		if (alt.equals("S")) {
			System.out.printf("%.1f", opera);
		}
		if (alt.equals("M")) {
			System.out.printf("%.1f", opera/12);
		}
		
		
	}

}
