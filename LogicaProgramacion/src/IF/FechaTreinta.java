
package IF;
import java.util.Scanner;

public class FechaTreinta {

	public static void main(String[] args) {
		/*17. Pedir el día, mes y año de una
		 *  fecha correcta y mostrar la fecha
		 *   del día siguiente. suponer que todos
		 *   los meses tienen 30 días.
*/
		int dia, mes, anio;
		 Scanner entrada= new Scanner(System.in);
		 System.out.print("Agrega el dia:  ");
		 dia=entrada.nextInt();
		 System.out.print("Agrega el mes:  ");
		 mes=entrada.nextInt();
		 System.out.print("Agrega el año:  ");
		 anio=entrada.nextInt();
		 if (dia<=30&&dia>=1) 
			 System.out.print("el dia :  " +dia);
		 
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
		 	if (dia<=30&&dia>=1) 
		 		dia=dia+1;
		 	System.out.print("el sigiente dia es " +dia);
		 	 
		 		
	
	}

}
