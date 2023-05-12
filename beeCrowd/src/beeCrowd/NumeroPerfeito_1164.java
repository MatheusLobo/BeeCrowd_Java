package beeCrowd;

import java.util.Scanner;

public class NumeroPerfeito_1164 {

	public static void main(String[] args) {
		int qnt,num,aux=0,div,aux2;;
		Scanner read = new Scanner (System.in);
		qnt= read.nextInt();
		while (aux<qnt) {
			num=read.nextInt();
			div=0;
			for (int i=1; i<num;i++) {
				if (num % i == 0) {
                    div += i;
                }
				if (div==num) {
					System.out.println(num+" Pefeito");
					break;
				} else if (div>num) {
					System.out.println(num+" nao eh perfeito");
				}
				
				}
			aux++;
			if (aux==qnt) {
				break;
			}
		
			}
		}
	}


