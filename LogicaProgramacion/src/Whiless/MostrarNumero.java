package Whiless;

import java.util.Scanner;

public class MostrarNumero {
	/*
	 * 8. Pedir un número N, y mostrar 
	 * todos los números del 1 al N.
*/
	public static void main(String[] args) {
	 int n=0;
	 int num;
	 Scanner entrada= new Scanner(System.in);
	 System.out.print("Introduzca número que no sea 0 : ");
	 num=entrada.nextInt();
	
		 while(n<=num){
			 System.out.println(n);
			 n++;
		 }
	 
}
}
