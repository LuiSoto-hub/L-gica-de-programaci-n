package Whiless;

import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
		/* Leer un número e indicar si es 
		 * positivo o negativo. El proceso 
		 * se repetirá hasta que se introduzca un 0.*/
		 int num;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		 while(num!=0){
			 if(num<0) {
				 System.out.println("el número es negativo: " +num);
				 
			 }
			 else {
				 System.out.println("el número es positivo " + num);
				 
			 }
			 System.out.println("agrega un nuevo número " );
			 num=entrada.nextInt();
			 
		 }
		

	}

}
