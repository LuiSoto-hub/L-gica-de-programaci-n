package BuclesAnidados;

import java.util.Scanner;

public class ContadorNumerosPrimos {

	public static void main(String[] args) {
		// 6. Realizar un programa que nos pida un número 
		//n, y nos diga cuantos números hay entre 1 y n que son primos. 
		int num, contadores=0, contador=0;
		Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		for(int i=1; i<=num; i++) {
			 contadores=i%2;
			 if(contadores==0) {
			  System.out.print("");
			  
			 }else {
				 contador++;
			 System.out.println("el numero primo es "+i + " total de numeros primos " + contador);
			 }
			 }
			
	}

}
