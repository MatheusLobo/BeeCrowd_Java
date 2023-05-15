package beeCrowd;

import java.util.Scanner;

public class PreenchimentoVetorIII_1178 {

	public static void main(String[] args) {
		double[] v= new double[100];
		double T,h;
		 int j=0;
		Scanner read = new Scanner (System.in);
		T=read.nextDouble();
		v[0]=T;
		
		for (int i=1;i<=99;i++) {
			v[i]=(v[i-1])/2;
		}
		
		
		
		
		
		
		for (j=0;j<=99;j++) {
			h=j;
			System.out.println(String.format("N[%d] = %.4f", j, v[(int) h]));
		}
				

	}

}
