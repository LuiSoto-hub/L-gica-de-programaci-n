import java.util.Scanner;

public class calificaswich {

	public static void main(String[] args) {
		//  Pedir una nota de 0 a 10 y mostrarla de la forma:
		//Insuficiente, Suficiente, Bien con swich
		int cali;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Agrega tu calificacion del 1 al 10 :  ");
		 cali=entrada.nextInt();
		 switch(cali) {
		 case 10:
			 System.out.print("excelente ");
		 case 9:
			 System.out.print("muy bien ");
		 case 8:
			 System.out.print(" bien");
		 case 7:
			 System.out.print("suficiente");
		 case 6:
			 System.out.print("pasable");
	
		 }
		 if(cali<=5&&cali>1)
			 System.out.print("reprobado");
		 else
				 System.out.print("tu calificacion no esta en el rengo de 1 a 10");
	}

}
