package EjerciciosBasicos;

import java.util.Scanner;

public class ProgramEmpresa {

	public static void main(String[] args) {
		/*17.Una empresa que se dedica a la venta de desinfectantes
		 *  necesita un programa para gestionar las 
		 *  facturas. En cada factura figura: el código del artículo,
		 *  la cantidad vendida en litros y el precio por litro. 
		 *  Se pide de 5 facturas introducidas: Facturación total, 
		 *  cantidad en litros vendidos del artículo 1 
		 *  y cuantas facturas se emitieron de más de 600 €.*/ 

		int codigoarticulo,cantidadvendidaxlitro, preciolitro ;
		float facturatotal = 0, cantidadlitros, facturasemitidas600, totallitros=0, sumafactoriatotal=0;
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("las facturas ");
		 for(int i=1; i<=3; i++) {
			 System.out.println("añade el codigo de articulo");
			 codigoarticulo=entrada.nextInt();
			 System.out.println("añade la cantidad vendida en litros");
			 cantidadvendidaxlitro=entrada.nextInt();
			 System.out.println("añade el precio por litro");
			 preciolitro=entrada.nextInt();
			 
			 facturatotal=cantidadvendidaxlitro*preciolitro;
			 System.out.println("facturacion total "+ facturatotal);
			 if (codigoarticulo==1) {
				 totallitros=cantidadvendidaxlitro+totallitros;
			 }
				 if(facturatotal>600) {
					 sumafactoriatotal++;
				 }	 
		 }	
		   System.out.println("\n\n\nResumen de ventas\n");
           // facturación total
           System.out.println("La facturación total es de: " +facturatotal + "€");
           // litros del articulo 1
           System.out.println("Ventas del producto 1: " + totallitros + " litros");
           
           
           // factura de mas de 600 euros
           System.out.println("Factura superior a 600€: " + sumafactoriatotal);
	}

}
