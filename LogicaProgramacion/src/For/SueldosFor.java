package For;

import java.util.Scanner;

public class SueldosFor {

	public static void main(String[] args) {
		/*
		 * 14. Pedir 10 sueldos. Mostrar su suma 
		 * y cuantos hay mayores de 1000€*/


		 Scanner entrada= new Scanner(System.in);
		int contador=0;
		int contador1=0;
		int salarios=0;
		int sumasalarios=0;
		for(int i=1; i<=10;i++) {
			System.out.print("Introduzca número: ");
			 salarios=entrada.nextInt();
			if(salarios<1000) {
				System.out.println("el salario es menor a 1000");
				contador++;
				sumasalarios=salarios+sumasalarios;
			}
			else {
				
			contador1++;	
			sumasalarios=salarios+sumasalarios;
			
			}
					
		}
		System.out.println("los salarios mayores son:  "+contador1);
		System.out.println("el salario total es: "+sumasalarios);
		
	}
	

}
