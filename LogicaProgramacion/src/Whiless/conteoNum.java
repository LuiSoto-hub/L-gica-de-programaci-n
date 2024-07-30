package Whiless;

import java.util.Scanner;

public class conteoNum {

	public static void main(String[] args) {
		/*Pedir números hasta que se teclee 
		 * uno negativo, y mostrar cuántos números 
		 * se han introducido.
*/ 
		 int num,contador=0;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		 while(num!=0){
			 if(num<0) {
				 System.out.println("el número es negativo: " +num);
				 num=0;
			 }
			 else {
				 System.out.println("el número es positivo " + num);
				 System.out.println("agrega un nuevo número " );
				 num=entrada.nextInt();
			 }
			 contador++;
			 System.out.println("el número conyadors: " +contador);
			
			 
		 }
		

	}

}
