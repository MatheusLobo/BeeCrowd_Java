package beeCrowd;

import java.util.Scanner;

public class Acima_da_diagonal_principal_1183 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double[][] m = new double[12][12];
		int diagp;
		double opera=0;;
		char alt = read.next().charAt(0);
		diagp=read.nextInt();
		int elementos=0;
		for (int i = 0; i <12; i++) {
			for (int j = 0; j <12; j++) {
				m[i][j] = read.nextDouble();
				if (j < i) { 
					opera += m[i][j];
                    elementos++;
                }}
		}
		
		 switch (alt) {
		 case 'S':
			System.out.printf("%.1f", opera);
			System.out.println("");
			break;
		
		 case 'M': 
			opera=opera/elementos;
			System.out.printf("%.1f", opera);
			System.out.println("");
			break;
		
		
	}

}
}
