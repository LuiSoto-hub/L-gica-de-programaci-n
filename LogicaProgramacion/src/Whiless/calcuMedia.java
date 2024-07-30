package Whiless;

import java.util.Scanner;

public class calcuMedia {

	public static void main(String[] args) {
		// 7. Pedir números hasta que se introduzca 
		//uno negativo, y calcular la media.
		 int n=0,contador=0;
		 int num, m=0, x=0;
		 int elementos;
		 int [] arra=new int[4];
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número que no sea 0 : ");
		 num=entrada.nextInt();
		 while (num!=n){
			 System.out.println("Introduzca número mas: ");
			 num=entrada.nextInt();
			 elementos=num;
			 System.out.println("numeros"+num);
			 contador=num+contador;
			 m=m+1;
		 }
		 
		 x=contador+m;
		 System.out.println("la suma de los numero son: "+contador);
	

	

	}

}
