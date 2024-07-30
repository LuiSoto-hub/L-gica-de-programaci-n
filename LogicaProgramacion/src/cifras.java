import java.util.Scanner;

public class cifras {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega un numero ");
		int num1= entrada.nextInt();
		if(num1>99999)
			System.out.println("el numero es mayor a 99999");
			if(num1<10)
				System.out.println("el numero tiene un numero");
			else
		if(num1<100)
			System.out.println("el numero tiene dos");
		else
		if(num1<1000)
			System.out.println("el numero tiene tres numero");
		else
		if(num1<10000)
			System.out.println("el numero tiene cuatro numero");
		else
		if(num1<100000)
			System.out.println("el numero tiene cinco numero");
		
			
	}

}
