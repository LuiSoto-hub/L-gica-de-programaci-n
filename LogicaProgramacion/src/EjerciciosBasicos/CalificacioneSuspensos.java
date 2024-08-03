package EjerciciosBasicos;

import java.util.Scanner;

public class CalificacioneSuspensos {

	public static void main(String[] args) {
		/*22.Pedir 5 calificaciones de alumnos 
		 * y decir al final si hay suspenso*/ 
		int calificaciones, contador=0;
		boolean suspensos=false;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("------------------------");
		 for(int i=1; i<=5; i++) {
			 System.out.println("añade una calificación");
			 calificaciones=entrada.nextInt();
			 if(calificaciones<6)
				 suspensos=true;	 
			 }
		 
			if (suspensos) {
				System.out.println("si hay suspensos ");
			}else
			 System.out.println("no hay suspensos " );
		 
		
		
	}

}
