package beeCrowd;

import java.util.Scanner;

public class UltrapassandoZ_1150 {
	public static void main(String[] args) {
		int x,z;
		Scanner input= new Scanner (System.in);
		
		x=input.nextInt();
		
		z=input.nextInt();
		
			while (x>z) {
				z=input.nextInt();
				
			}
		int soma=x;
		int qnt=1;
			while (soma<z) {
				soma=soma+x+qnt;
				qnt++;
			}
			
			 System.out.println(qnt);
			 input.close();
			
		}
		
		
}

