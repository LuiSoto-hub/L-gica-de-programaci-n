package For;

import java.util.Scanner;

public class EdadesAlturas {

	public static void main(String[] args) {
		/*
		 * 15. Dadas las edades y alturas de 5 alumnos,
		 *  mostrar la edad y la estatura media, la cantidad de
		 *  alumnos mayores de 18 años, y la cantidad
		 *  de alumnos que miden más de 1.75.
*/
		int edad, altura, edades=0, alturas=0, sumaedad, sumaaltura, alumno, mediae, mediaa, contador=0, mayoresdeunmetro=0, mayoresde18=0;
		
		 Scanner entrada= new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			 System.out.println("Introduzca edad: ");
			 edad=entrada.nextInt();
			 System.out.println("Introduzca altura : ");
			 altura=entrada.nextInt();
		if(edad>18) {
			mayoresde18++;
		}
		if(altura>175)
		{
			mayoresdeunmetro++;
		}
			 edades=edad+edades;
			 alturas=alturas+altura;
			 
			 contador++;
		}
		
		mediae=edades/contador;
		mediaa=alturas/contador;
		 System.out.println("media de edad"+ mediae);
		 System.out.println("media de altura "+ mediaa);
		 System.out.println(" las personas mayores son "+ mayoresde18);
		 System.out.println("las personas altas son"+ mayoresdeunmetro);
		 
	}

}
