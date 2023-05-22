package beeCrowd;

import java.util.Scanner;

public class Menor_Posicao_1180 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num=read.nextInt();
        int[] v=new int[num];
        int menor=Integer.MAX_VALUE;
        int pos = 0;
        for (int i=0;i<num;i++) {
            v[i]=read.nextInt();
            if (v[i]<menor) {
                menor=v[i];
                pos=i;
            }
        }
        System.out.println("Menor valor: " +menor);
        System.out.println("Posicao: " +pos);
    }
}

