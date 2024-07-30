import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		//  Pedir una nota de 0 a 10 y mostrarla de la forma:
		//Insuficiente, Suficiente, Bien...
		int cali;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Agrega tu calificacion:  ");
		 cali=entrada.nextInt();
		if(cali>=8)
			 System.out.print("tu calificacion es excelente  ");
		if(cali<=7&&cali>=6)
			 System.out.print("tu calificacion es suficeinte  ");
		if(cali<5)
		 System.out.print("tu calificacion es insuficiente ");
	}

}
