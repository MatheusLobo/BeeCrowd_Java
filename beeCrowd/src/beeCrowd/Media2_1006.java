package beeCrowd;

import java.util.Scanner;

public class Media2_1006 {

	public static void main(String[] args) {
		double a,b,c,media;
		Scanner input = new Scanner (System.in);
		a= input.nextDouble();
		b= input.nextDouble();
		c= input.nextDouble();
		a=a*2;
		b=b*3;
		c=c*5;
		
		//a=(a+b+c)/10;
		media=(a+b+c)/10;
		
		System.out.println(String.format("MEDIA = %.1f",media));
		
	}

}
