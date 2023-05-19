package beeCrowd;

import java.math.BigDecimal;
import java.util.Scanner;

public class NotaseMoedas_1021 {

	   public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        double valor = read.nextDouble();
	       

	        System.out.println("NOTAS:");
	        int[] notas = { 100, 50, 20, 10, 5, 2 };
	        for (int nota : notas) {
	            int quantidadeNotas = (int) (valor / nota);
	            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota * 1.0);
	            valor %= nota;
	        }

	        System.out.println("MOEDAS:");
	        int[] moedas = { 100, 50, 25, 10, 5, 1 };
	        valor *= 100; 
	        for (int moeda : moedas) {
	            int quantidadeMoedas = (int) (valor / moeda);
	            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
	            valor %= moeda;
	        }
	    }
	}
	            