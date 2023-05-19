package beeCrowd;

import java.util.Scanner;

public class SequênciadeNúmeroseSoma_1101 {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int m, n;
        do {
            m = read.nextInt();
            n = read.nextInt();
            
            if (m <= 0 || n <= 0)
                break;
            
            int sum = 0;
            int min = Math.min(m, n);
            int max = Math.max(m, n);
            
            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            
            System.out.println("Sum=" + sum);
        } while (true);
        
       
    }
}