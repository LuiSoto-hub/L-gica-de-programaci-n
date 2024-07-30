package Whiless;

import java.util.Scanner;

public class adivinarNumero {

	public static void main(String[] args) {
		/*Realizar un juego para adivinar 
		 * un número. Para ello pedir un número N,
		 *  y luego ir pidiendo números indicando “mayor” o “menor” 
		 *  según sea mayor o menor con respecto
		 *   a N. El proceso termina cuando el usuario acierta
		 * */

		 int n=0,contador=0;
		 int num;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		 while (num!=n){
			 if(num>n) { 
				 System.out.print("Introduzca número mayor: ");
			 n=entrada.nextInt();
			 } else{
					 System.out.print("Introduzca número menor: ");
					 n=entrada.nextInt();
					
			 }
			 contador++;
			
		 }
		 System.out.println("intentos que realizaste para adivinar el numero: "+contador);
	}
	

}
