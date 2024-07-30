package Whiless;

import java.util.Scanner;

public class LeerNumero {

	public static void main(String[] args) {
		/* 1. Leer un número y mostrar su cuadrado, 
		 * repetir el proceso hasta que se introduzca un número
		negativo.
		*/ 

		 // num guardará el número que leamos
		 // y cuadrado guardará el cuadrado de num
		 int num,cuadrado;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		 while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
		 num=num*num;
		 System.out.println(num+ "² es igual a "+ num);
		 System.out.print("Introduzca otro número: ");
		 num=entrada.nextInt(); // volvemos a leer num
	}

}
}