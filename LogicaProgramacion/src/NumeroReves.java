import java.util.Scanner;

public class NumeroReves {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
		int num;
		 int dm, um, c, d, u;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Introduzca un número entre 0 y 99.999: ");
		 num=entrada.nextInt();
		
		 // unidad
		 u = num % 10;
		 num = num / 10;
		 // decenas
		 d = num % 10;
		 num = num / 10;
		 // centenas
		 c = num % 10;
		 num = num / 10;
		 // unidades de millar
		 um = num % 10;
		 num = num / 10;
		 // decenas de millar
		 dm = num;
		 // lo imprimimos al revés:
		 System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
		 // otra forma de hacerlo es
		 num = 10000*u + 1000*d + 100*c + 10*um + dm;
		 System.out.println (num);

	}

}
