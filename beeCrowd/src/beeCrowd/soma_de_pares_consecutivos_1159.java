package beeCrowd;

import java.util.Scanner;

public class soma_de_pares_consecutivos_1159 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {
            int sum = 0;
            if (x % 2 != 0) {
                x++;
            }
            for (int i = 0; i < 5; i++) {
                sum += x;
                x += 2;
            }
            System.out.println(sum);
            x = sc.nextInt();
        }

        sc.close();
    }
}
