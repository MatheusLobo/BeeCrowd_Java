package beeCrowd;

import java.util.Scanner;
public class VariasNotasComValidacao_1118 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float nota1, nota2, media;
        int calc = 0;

        while (true) {
            while (true) {
                nota1 = read.nextFloat();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota invalida");
                } else {
                    break;
                }
            }

            while (true) {
                nota2 = read.nextFloat();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                } else {
                    break;
                }
            }

            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);

            while (true) {
                System.out.println("novo calculo (1-sim 2-nao)");
                calc = read.nextInt();
                if (calc == 1 || calc == 2) {
                    break;
                }
            }

            if (calc == 2) {
                break;
            }
        }
    }
}
