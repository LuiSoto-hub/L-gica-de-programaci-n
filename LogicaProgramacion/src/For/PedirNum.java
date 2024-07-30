package For;

import java.util.Scanner;

public class PedirNum {

	public static void main(String[] args) {
		// 12. Pedir un número y calcular su factorial. 
		 int f;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca número: ");
		 f=entrada.nextInt();
		 int factorial=0;
		int sum=0;
		 for(int i=1; i<=f; i++)
		 {
			sum=f*i; 
			System.out.println(sum);
			factorial=sum+factorial;
		 }
		 System.out.println(factorial);
		 
	}

}
