import java.util.Scanner;

public class numerosIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir dos números y decir cual es el mayor o si son iuales 
		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		num1= entrada.nextInt();
		System.out.println("agrega un numero ");
		num2= entrada.nextInt();
		if (num1==num2)
			System.out.println("son iguales");
		else {
		if (num1<num2)
			System.out.println("el "+num1+ " es menor, y el numero "+num2+" es mayor.");
		else 
			System.out.println("el "+num2+" es menor, y el numero "+num1+" es mayor.");
		}
	}

}
