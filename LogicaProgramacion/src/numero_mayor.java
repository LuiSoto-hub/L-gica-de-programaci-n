import java.util.Scanner;

public class numero_mayor {

	public static void main(String[] args) {
		//Pedir dos números y decir cual es el mayor.
		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		num1= entrada.nextInt();
		System.out.println("agrega un numero ");
		num2= entrada.nextInt();
		if (num1<num2)
			System.out.println("el "+num1+ "es menor"+ "y el numero "+num2+" es mayor");
		else 
			System.out.println("el "+num2+"es menor" + "y el numero "+num1+"es mayor");

	}

}
