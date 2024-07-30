package EjerciciosBasicos;

import java.util.Scanner;

public class NotasSeis {

	public static void main(String[] args) {
		//  19.Dadas 6 notas, escribir la cantidad 
		//de alumnos aprobados, condicionados (=4) y suspensos.
		int notas, aprobados=1;
		 Scanner Entrada= new Scanner(System.in);  
		 System.out.println("agrega tu nota ");
		
		 for(int i=0; i>3; i++) {
			 notas=Entrada.nextInt();
			 if(notas>=4) {
				 System.out.println("es aprobado");
			     aprobados++;
			 }
			 else {
				 System.out.println("esta reprobado");
			 }
		 }
			 
		
		
	}
}
