package beeCrowd;

import java.util.Scanner;

public class Salario_1008 {

	public static void main(String[] args) {
		int num;
		int horas;
		double sal_h;
		Scanner read = new Scanner (System.in);
		num=read.nextInt();
		horas=read.nextInt();
		sal_h=read.nextDouble();
		
		sal_h=sal_h*horas;
		System.out.println("Number = "+num);
		System.out.printf("SALARY = U$ %.2f", sal_h);

	}

}
