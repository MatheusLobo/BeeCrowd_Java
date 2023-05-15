package beeCrowd;

import java.util.Scanner;

public class Fibonaccivetor_1176 {
	public static void main(String[] args) {
       long[] v= new long[61];
       int t,num;
        Scanner read = new Scanner (System.in);
        t=read.nextInt();
        v[0]=0;
        v[1]=1;
        	while (t!=0) {
        		
        		if (t==0) break;
        		for (int i=2;i<v.length;i++) {
        			v[i]=v[i-1]+v[i-2];
        			
        		}
        		num=read.nextInt();
        		System.out.println("Fib("+num+") = "+v[num]);
        		t--;	
        	}
            
        }
    }
