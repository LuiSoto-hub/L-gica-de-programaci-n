import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		//Pedir un número entre 0 y 9.999, decir si es capicúa
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
		 if(dm == u && um == d)
			 System.out.print("el numero es capicua");
		 else
			 System.out.print("el numero no es capicua");
			 
	}

}
