package For;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//12. Pedir un número y calcular su factorial. 
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 int num=entrada.nextInt();
		 double f=1;
		for(int i=num; i>0; i--) {

			f=i*f;
		
			
		}
		System.out.print("la factorial es " + f);
			

	}

}
