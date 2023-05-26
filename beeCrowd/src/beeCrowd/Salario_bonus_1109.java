package beeCrowd;

import java.util.Scanner;

public class Salario_bonus_1109 {


	public static void main(String[] args) {
		
		double vendas;
		double sal_f;
		String nome;
		Scanner read = new Scanner (System.in);
		nome=read.nextLine();
		sal_f=read.nextDouble();
		vendas=read.nextDouble();
		
		sal_f=sal_f+(vendas*0.15);
		
		System.out.printf("TOTAL = R$ %.2f", sal_f);

	}

}
