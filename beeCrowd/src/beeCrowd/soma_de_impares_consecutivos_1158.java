package beeCrowd;

import java.util.Scanner;

public class soma_de_impares_consecutivos_1158 {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int n,x,y,soma=0;
	n=scan.nextInt();
	
	boolean prin=true;
	 while (n!=0) {
	 x=scan.nextInt();
	y=scan.nextInt();
		 for(y=y;y%3==0;y++) {
			 if (y>x) {
				 System.out.println(soma);
				  break;}
			 soma=soma+y;
			 if (prin && x%3==0) {
				 soma=soma+x;
				 prin = false;
			 }
			
			 
		 }

		 
			  }
		 
	 }
}

