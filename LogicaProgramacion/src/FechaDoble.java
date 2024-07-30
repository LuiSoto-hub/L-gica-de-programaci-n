import java.util.Scanner;

public class FechaDoble {

	public static void main(String[] args) {
		/* Pedir dos fechas y mostrar el 
		 * número de días que hay de diferencia.
		 *  Suponiendo todos los meses de 30
		días.
		*/
		
		int dia, mes, anio, dia2, mes2, anio2, fecha1, fecha2, dias;
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
		 //segunda fecha a ingresar
		 System.out.print("segunda fecha");	 
		 System.out.print("Agrega el dia:  ");
		 dia2=entrada.nextInt();
		 System.out.print("Agrega el mes:  ");
		 mes2=entrada.nextInt();
		 System.out.print("Agrega el año:  ");
		 anio2=entrada.nextInt();
		 if (dia2<=30&&dia2>=1) 
			 System.out.print("el dia :  " +dia2);
		 
		 else 
			 System.out.print("el dia no es correcto:  ");
		
		 if(mes2<=12&&mes2>=1) 
			 System.out.println("el mes es:  "+ mes2);
	
		 else 
			 System.out.print("el mes no es correcto:  ");
		 
		 if(anio2<=2024&&anio2>=1900) {
			 System.out.println("el Año es:  "+ anio2);}
		 else {
			 System.out.print("el año no es correcto:  ");
	}
		
		 fecha1=dia+30*mes+360*anio;
		 fecha2=dia2+30*mes2+360*anio2;
		 dias=fecha1-fecha2;
		 System.out.print("los dias son " +dias);

	}

}
