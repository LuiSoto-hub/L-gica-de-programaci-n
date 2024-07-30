import java.util.Scanner;

public class Orden {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de mayor a menor.
		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		num1= entrada.nextInt();
		System.out.println("agrega un numero ");
		num2= entrada.nextInt();
		if (num1==num2)
			System.out.println("el orden es "+num1+num2);
		else {
		if (num1<num2)
			System.out.println("el orden es "+num1+","+num2);
		else 
			System.out.println("el orden es "+num2+","+ num1);
		}
	}

}
