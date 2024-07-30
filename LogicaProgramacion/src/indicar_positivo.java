import java.util.Scanner;

public class indicar_positivo {

	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		num1= entrada.nextInt();
		
		if(num1<0)
			System.out.println("el numero es negativo");
		else 
			System.out.println("el numero es positivo");
			
	}

}
