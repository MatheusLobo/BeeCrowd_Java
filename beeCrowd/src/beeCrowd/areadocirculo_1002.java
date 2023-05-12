package beeCrowd;

import java.util.Scanner;

public class areadocirculo_1002 {

	public static void main(String[] args) {
		double PI=3.14159,area;
		double raio;
		
		Scanner input = new Scanner (System.in);
		raio = input.nextDouble();
		
		area=PI*(raio*raio);
		
		System.out.println(String.format("A=%.4f",area));
		
	}

}
