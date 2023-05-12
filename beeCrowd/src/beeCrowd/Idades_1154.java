package beeCrowd;

import java.util.Scanner;

public class Idades_1154 {
	public static void main(String[] args) {
		int a,b,c;
		float idade=0;
		float i=0;
		Scanner input = new Scanner (System.in);
		b=0;
		a=input.nextInt();
		while (a>=0) {
			idade=idade+a;
			a=input.nextInt();			
			i++;
			
			}
			if (a<0) {

				idade=idade/i;
				System.out.println((String.format("%.2f", idade)));

			}
			
		}
		
	
}
//34
//56
//44
//23