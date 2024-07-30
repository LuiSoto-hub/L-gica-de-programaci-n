 package EjerciciosBasicos;

import java.util.Scanner;

public class tablamultiplicar {

	public static void main(String[] args) {
		//  16.Pide un número (que debe estar entre 0 y 10)
		//y mostrar la tabla de multiplicar de dicho número.
		int numero;
		
		 Scanner entrada= new Scanner(System.in);
	
		 
		 do {
			 System.out.println("agrega un numero del 1 al 10");
			 numero=entrada.nextInt();
			 
		 }while(numero>10 && numero<0); 
		 for(int i=1; i<=10; i++) {
			
			 System.out.println(i+"x"+numero+"="+numero*i);
			 
		 }
		 
	}

}
