package EjerciciosBasicos;

import java.util.Scanner;

public class numeroNegativo {

	public static void main(String[] args) {
		/*21.Pedir 10 números, y mostrar 
		 * al final si se ha introducido alguno negativo.*/ 
		int numero, negativo=0 ;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("------------------------");
		 for(int i=1; i<=10; i++) {
			 System.out.println("añade un numero");
			 numero=entrada.nextInt();
			 if(numero<0)
				 negativo=numero;
		 }
		 System.out.println("el numero negativo es " + negativo);
		
	}

}
