package beeCrowd;

import java.util.Scanner;

public class Menor_Posicao_1180 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num;
		num=read.nextInt();
		int menor=0,pos=0;
		boolean prim=true;
		int[] v= new int[num];
			for(int i=0; i<num;i++) {
				v[i]=read.nextInt();
				if (i>=1&& i<num) {
					if (v[0]>v[i]&&prim==true) {
						menor=v[i];
						pos=i;
						prim=false;
					} else if (v[i]>v[0]) {
						menor=v[0];
						pos=i;
						prim=false;
					
					}
				}
				if (v[i]>v[i+1] && i<num) {
					menor=v[i+1];
					pos=i+1;
				} else if (v[i]<v[i+1] && i<num){
					menor=v[i];
					pos=i;
					
				}
			}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+pos);
			
	}

}
