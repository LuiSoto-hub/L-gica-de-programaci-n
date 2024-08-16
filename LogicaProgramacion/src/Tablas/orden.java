package Tablas;
		//  1. Leer 5 números y mostrarlos en el mismo orden introducido.
		import java.util.Scanner;

		public class orden {
		    public static void main(String[] args) {
		        // Crear un objeto Scanner para leer la entrada del usuario
		        Scanner scanner = new Scanner(System.in);

		        // Crear un arreglo para almacenar los cinco números
		        int[] numeros = new int[5];

		        // Leer cinco números del usuario
		        System.out.println("Introduce 5 números:");
		        for(int i=0; i<5; i++) {
		        numeros[i] = scanner.nextInt(); // Leer un número entero del usuario
		        }
		        
		        for(int i=0; i<5; i++) {
		        	System.out.println(numeros[i]);
		        	
		    }
		    }
		}
