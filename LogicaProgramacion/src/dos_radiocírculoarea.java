import java.util.Scanner;

public class dos_radiocírculoarea {

	public static void main(String[] args) {
	//2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
		double PI=3.14159265359;
		System.out.println("agrega el radio");
		Scanner entrada= new Scanner(System.in);
		int r= entrada.nextInt();
		double A=PI*+ Math.pow(r, 2);
		System.out.println("El Area es; " + A);
		
	}

}
