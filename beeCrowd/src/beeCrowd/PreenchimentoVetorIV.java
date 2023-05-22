package beeCrowd;

import java.util.Scanner;

public class PreenchimentoVetorIV {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor_par = new int[5];
        int[] vetor_impar = new int[5];
        int num,i=0,j= 0;
        for (int k=0;k<15;k++) {
            num=read.nextInt();
            if (num%2 == 0) {
                vetor_par[i]=num;
                i++;
            } else {
                vetor_impar[j]=num;
                j++;
            }
            if (i==5) {
                for (int h=0;h<5;h++) {
                    System.out.println("par["+h+"] = "+vetor_par[h]);
                }
                i = 0;
            }
            if (j == 5) {
                for (int t = 0; t < 5; t++) {
                    System.out.println("impar["+t+"] = " + vetor_impar[t]);
                }
                j = 0;
            }
        }
        for (int t=0;t<j;t++) {
            System.out.println("impar["+t+"] = " + vetor_impar[t]);
        }
        for (int h=0;h<i;h++) {
            System.out.println("par["+h+"] = " + vetor_par[h]);
        }
    }
}