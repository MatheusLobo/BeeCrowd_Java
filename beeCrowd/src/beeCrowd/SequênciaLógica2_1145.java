package beeCrowd;

import java.util.Scanner;

public class SequênciaLógica2_1145 {
    public static void main(String[] args) {
        int x, y, limite;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        limite = y;
        int j = 1;

        for (int i = 1; i <= y; i++) {
            if (i < limite) {
                System.out.print(i);
                if (j < x) {
                    System.out.print(" ");
                    j++;
                } else {
                    System.out.println();
                    j = 1;
                }
            } else {
                System.out.println(i);
            }
        }
    }
}