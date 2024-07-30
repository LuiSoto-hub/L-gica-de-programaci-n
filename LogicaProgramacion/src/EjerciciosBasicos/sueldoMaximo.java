package EjerciciosBasicos;

import java.util.Scanner;

public class sueldoMaximo {

	public static void main(String[] args) {
		//  20.Pedir un número N, introducir N 
		//sueldos, y mostrar el sueldo máximo.
		float sueldo, sueldonew=0, sueldomaximo=0;
		int num; 
		Scanner Entrada= new Scanner(System.in);  
		 
		 System.out.println("agrega un cuanto sueldos quieres agregar");
		 num=Entrada.nextInt();
	
		 for(int i=0; i<num; i++) {
			 System.out.println("agrega los sueldos ");
		 sueldo=Entrada.nextInt();
		 if(sueldo>sueldonew) {
			 sueldonew=sueldo;
		 }
		 System.out.println("el sueldo maximo es: "+ sueldonew);
		 }
			 
		 }

}
