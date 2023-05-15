package beeCrowd;

import java.util.Scanner;

public class UltrapassandoZ_1150 {
    public static void main(String[] args) {
        int x, z;
        Scanner read = new Scanner(System.in);

        x = read.nextInt();

        z = read.nextInt();

        while (x >= z) {
            z = read.nextInt();
        }

        int soma = x;
        int qnt = 1;
        while (soma <= z) {
            soma += x + qnt;
            qnt++;
        }

        System.out.println(qnt);
        read.close();
    }
}