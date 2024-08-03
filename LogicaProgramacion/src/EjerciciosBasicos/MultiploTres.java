package EjerciciosBasicos;

import java.util.Scanner;

public class MultiploTres {

	public static void main(String[] args) {
		/*23.Pedir 5 números e indicar si alguno es múltiplo de 3.*/ 
		int num, contador=3, contadores=0 ;
		boolean indicardor=false;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("------------------------");
		 for(int i=1; i<=5; i++) {
			 System.out.println("añade un numero");
			 num=entrada.nextInt();
			 contadores=num%contador;
			 if(contadores==0) {
				 System.out.println("***********:)**********");
			     indicardor=true;
			 }
			 }
		 if(indicardor)
			 System.out.println("si hay números multiplos de tres!!!");
	
	}

}
