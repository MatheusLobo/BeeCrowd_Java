package beeCrowd;
import java.util.Scanner;
public class Calculo_Simples_1010 {

	public static void main(String[] args) {
		int num_p1,num_p2;
		double valor_u1,valor_u2;
		int qnt_p1,qnt_p2;
		double valor_f;
		Scanner read = new Scanner(System.in);
		
		num_p1=read.nextInt();
		qnt_p1=read.nextInt();
		valor_u1=read.nextDouble();
		
		num_p2=read.nextInt();
		qnt_p2=read.nextInt();
		valor_u2=read.nextDouble();
		
		valor_f=qnt_p1*valor_u1+(qnt_p2*valor_u2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",valor_f );
		
		
		
	}

}
