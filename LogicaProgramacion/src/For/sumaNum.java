package For;
import java.util.Scanner;

public class sumaNum {

	public static void main(String[] args) {
		/*
		 * 10. Pedir 15 números y escribir la suma total.
		 * 
*/       
		 int num=0, sum=0;
		 Scanner entrada= new Scanner(System.in);
		
		for(int i=0; i<15; i++) {
			 System.out.print("Introduzca número : ");
			 num=entrada.nextInt();
			 sum=num+sum;
}
		 System.out.print("suma: "+ sum);
}
}
