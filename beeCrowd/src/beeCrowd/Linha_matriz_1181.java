package beeCrowd;

import java.util.Scanner;

public class Linha_matriz_1181 {

	public static void main(String[] args) {
		
		float[][] mt = new float[12][12];
		int n,soma=0;
		String ch;
		Scanner read = new Scanner (System.in);
		n= read.nextInt();
		ch=read.next();
		for (int coluna=0;coluna<mt[n].length;coluna++) {
			mt[n][coluna]=read.nextFloat();
			soma+=coluna;
		}
		if (ch=="S"||ch=="s") {
			System.out.println(soma);
		}
		if (ch=="M"||ch=="m") {
		System.out.println(soma/12);
		
	}

}}
