package beeCrowd;
import java.util.Scanner;

public class Java_1145 {

	public static void main(String[] args) {
		int x,y;
		Scanner input= new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		int j=1;
			for (int i=1;i<=y;i++) {
				
					System.out.print(i+"");
					j++;
				if (j>x && i!=y) {
					System.out.println();
					j=1;
				}
			}
	
	}

}
