package Whiless;

import java.util.Scanner;

public class SumaDeNumeros {

	public static void main(String[] args) {
		/*Pedir números hasta que se teclee un 0,
		 *mostrar la suma de todos los números introducidos.*/
		 int n=0,contador=0;
		 int num;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número que no sea 0 : ");
		 num=entrada.nextInt();
		 while (num!=n){
			 System.out.print("Introduzca número mas: ");
			 num=entrada.nextInt();
			 contador=num+contador;
			
		 }
		 System.out.println("la suma de los numero son: "+contador);
	

	}

}
