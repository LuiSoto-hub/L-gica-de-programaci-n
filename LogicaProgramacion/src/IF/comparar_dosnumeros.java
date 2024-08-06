package IF;

import java.util.Scanner;

public class comparar_dosnumeros {

	public static void main(String[] args) {
		// Pedir dos números y decir si son iguales o no.

		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero para comparar");
		num1= entrada.nextInt();
		System.out.println("agrega otro numero para comparar");
		num2= entrada.nextInt();
		
		if(num1==num2) 
			System.out.println("los numeros son iguales");
			else 
				System.out.println("los numeros son diferentes ");
					
	}

}
