import java.util.Scanner;

public class multiplo {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo del otro.
		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		num1= entrada.nextInt();
		System.out.println("agrega un numero ");
		num2= entrada.nextInt();
		if(num1%num2==0)
			System.out.println("el numero es multiplo");
		else
			System.out.println("el numero no es multiplo");
	
	}

}
