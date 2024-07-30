import java.util.Scanner;

public class PedirFecha {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha e 
		//indicar si la fecha es correcta.
		//Suponiendo todos los meses de 30 días.
		int dia, mes, anio;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Agrega el dia:  ");
		 dia=entrada.nextInt();
		 System.out.print("Agrega el mes:  ");
		 mes=entrada.nextInt();
		 System.out.print("Agrega el año:  ");
		 anio=entrada.nextInt();
		 if (dia<=30&&dia>=1)
			 System.out.println("el dia es:  "+ dia);
		 else
			 System.out.print("el dia no es correcto:  ");
		 if(mes<=12&&mes>=1)
			 System.out.println("el mes es:  "+ mes);
		 else
			 System.out.print("el mes no es correcto:  ");
		 if(anio<=2024&&anio>=1900)
			 System.out.println("el Año es:  "+ anio);
		 else
			 System.out.print("el año no es correcto:  ");
	}

}
