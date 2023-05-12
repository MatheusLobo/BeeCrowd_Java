package beeCrowd;

import java.util.Scanner;

public class Media_1005 {

	public static void main(String[] args) {
		double a,b,media;
		Scanner input = new Scanner (System.in);
		a= input.nextDouble();
		b= input.nextDouble();
		media=((a*3.5)+(b*7.5))/11;
		//a=a*3.5;
		//b=b*7.5;
		//media=a+b/11
		System.out.println(String.format("MEDIA = %.5f",media));

	}

}
