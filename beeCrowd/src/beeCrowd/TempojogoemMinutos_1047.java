package beeCrowd;

import java.util.Scanner;

public class TempojogoemMinutos_1047 {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int horaInicial = read.nextInt();
        int minutoInicial = read.nextInt();
        int horaFinal = read.nextInt();
        int minutoFinal = read.nextInt();
       
        int duracaoHoras, duracaoMinutos;

        int minutosTotaisInicial = horaInicial * 60 + minutoInicial;
        int minutosTotaisFinal = horaFinal * 60 + minutoFinal;

        if (minutosTotaisInicial < minutosTotaisFinal) {
            duracaoHoras = (minutosTotaisFinal - minutosTotaisInicial) / 60;
            duracaoMinutos = (minutosTotaisFinal - minutosTotaisInicial) % 60;
        } else {
            int minutosDuracao = (24 * 60 - minutosTotaisInicial) + minutosTotaisFinal;
            duracaoHoras = minutosDuracao / 60;
            duracaoMinutos = minutosDuracao % 60;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
    }
}