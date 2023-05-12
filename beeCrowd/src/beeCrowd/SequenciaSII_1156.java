package beeCrowd;

public class SequenciaSII_1156 {



	   public static void main(String[] args) {
	        double s = 1.0;
	        double i = 3.0;
	        double j = 2.0;

	        while (i <= 39.0) {
	            s += i / j;
	            i += 2.0;
	            j *= 2.0;
	        }

	        System.out.printf("%.2f\n", s);
	    }
	}