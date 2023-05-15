package beeCrowd;

import java.util.Scanner;

public class PreenchimentoII_1177 {

	public static void main(String[] args) {
		int[] v= new int[1000];
		int T,j=0;
		Scanner read = new Scanner (System.in);
		T=read.nextInt();
		
		for (int i=0;i<v.length;i++) {
			if (i<T) v[i]=i;
				if (j>=T) j=0;
				if (i>=T) {
					v[i]=j;
					j++;
					
				}
		}
		for (int h=0;h<v.length;h++) System.out.println("N["+h+"] = "+v[h]);
		

	}

}
