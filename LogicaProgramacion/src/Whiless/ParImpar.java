package Whiless;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*3. Leer números hasta que se 
		 * introduzca un 0. Para cada uno 
		 * indicar si es par o impar.*/
		 int num;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 num=entrada.nextInt();
		 while(num!=0){
			 num=num%2;
			 if(num==0) {
				 System.out.println("el número es par " );
				 
			 }
			 else {
				 System.out.println("el número es impar " + num);
				 
			 }
			 System.out.println("agrega un nuevo número " );
			 num=entrada.nextInt();
	}
	}
}
