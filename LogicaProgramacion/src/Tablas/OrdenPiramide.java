package Tablas;

import java.util.Scanner;

public class OrdenPiramide {

	public static void main(String[] args) {
		// 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el 
		//penúltimo, el tercero, etc.
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("agrega 10 numeros ");
	        int[] numeros = new int[10];
	        for(int i=0; i<10; i++) {
		        numeros[i] = scanner.nextInt(); // Leer un número entero del usuario
		        }
	        System.out.println(numeros[0]);//imprimi en la consola el orden resuelto igual podemos usar un for 
	        System.out.println(numeros[9]);//que nos muestre el primero y el ultimo por ejemplo
	        System.out.println(numeros[1]);//for(int i=0 i<5 i++) este for nos ayuda a mostrar el primer numero
	        System.out.println(numeros[8]);//y el ultimo diceindole que imprima en pantalla i=0 y [9] pero le restamos 
	        System.out.println(numeros[2]);//i-- asi segun el ejercicio  System.out.println(numeros[i]); System.out.println(numeros[9 - i]);
	        System.out.println(numeros[7]);
	        System.out.println(numeros[3]);
	        System.out.println(numeros[6]);
	        System.out.println(numeros[4]);
	        System.out.println(numeros[5]);
		
	}

}
