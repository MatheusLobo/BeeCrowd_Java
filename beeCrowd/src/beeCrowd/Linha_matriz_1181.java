package beeCrowd;

import java.util.Scanner;

public class Linha_matriz_1181 {

	public static void main(String[] args) {
		double[][] m = new double[12][12];
		int lin;
		double opera=0;;
		
		Scanner read = new Scanner(System.in);
		lin=read.nextInt();
		char alt = read.next().charAt(0);
		
		for (int i=0; i<m.length;i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=read.nextDouble();

		}	}
		
		 switch (alt) {
		 case 'S':
			for (int i=0; i<m.length;i++) {
				opera = m[lin][i]+opera;
			}
			System.out.printf("%.1f", opera);
			System.out.println("");
			break;
		
		 case 'M': 
			for (int i=0; i<m.length;i++) {
				opera = m[lin][i]+opera;
			}
			opera=opera/12;
			System.out.printf("%.1f", opera);
			System.out.println("");
			break;
		
		
	}

}
}
