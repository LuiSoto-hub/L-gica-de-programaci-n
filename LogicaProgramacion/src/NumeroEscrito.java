import java.util.Scanner;

public class NumeroEscrito {

	public static void main(String[] args) {
		// 22. Pedir un número de 0 a 99 y mostrarlo escrito. 
		//Por ejemplo, para 56 mostrar: cincuenta y seis.
		int nota, unidad, d;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega la nota ");
		nota= entrada.nextInt();
		String calificacion;
		String datou;
		String datod;
		
		if(nota<=20) {
		switch(nota){
		case 0:
			calificacion="cero";
			break;
		case 1:
			calificacion="UNO";
			break;
		case 2:
			calificacion="DOS";
			break;
		case 3:
			calificacion="TRES";       ;
		case 4:
			calificacion="CUATRO";
			break;
		case 5:
			calificacion="QUINTO";
			break;
		case 6:
			calificacion="SEXTO";
			break;
		case 7:
			calificacion="SEPTIMO";
			break;
		case 8:
			calificacion="OCTAVO";
			break;
		case 9:
			calificacion="NOVENO";
			break;
		case 10:
			calificacion="DECIMO";
			break;	
		case 11:
			calificacion="once";
			break;
		case 12:
			calificacion="DOce";
			break;
		case 13:
			calificacion="TREce";
			break;
		case 14:
			calificacion="CATORCE";
			break;
		case 15:
			calificacion="QUINCE";
			break;
		case 16:
			calificacion="DIECISEIS";
			break;
		case 17:
			calificacion="DIECICIETE";
			break;
		case 18:
			calificacion="DICIOCHO";
			break;
		case 19:
			calificacion="DICINUEVE";
			break;
		case 20:
			calificacion="VEINTE";
			break;	
		default:
			calificacion="invalido";
			break;	
			
			
		}
		System.out.println(calificacion);
		}
		else {
	
			 // unidad
			  unidad = nota % 10;
			 nota = nota / 10;
			 // decenas
			 d = nota % 10;
			 nota = nota / 10;
			 
			 if(unidad<10) {
					switch(unidad){
					case 0:
						datou="cero";
						break;
					case 1:
						datou="UNO";
						break;
					case 2:
						datou="DOS";
						break;
					case 3:
						datou="TRES";       ;
					case 4:
						datou="CUATRO";
						break;
					case 5:
						datou="CINCO";
						break;
					case 6:
						datou="SEIS";
						break;
					case 7:
						datou="SIETE";
						break;
					case 8:
						datou="OCHO";
						break;
					case 9:
						datou="NUEVE";
						break;
					default:
						datou="invalido";
						break;	
				
					}
					System.out.println( datou);

					 if(d<=10) {
							switch(d){
							case 0:
								datod="ceroo";
								break;
							case 1:
								datod="diez y ";
								break;
							case 2:
								datod="veinte y ";
								break;
							case 3:
								datod="TREINTA Y ";
								break;
							case 4:
								datod="CUARENTA Y ";
								break;
							case 5:
								datod="CINCUENTA Y ";
								break;
							case 6:
								datod="SESENTA Y ";
								break;
							case 7:
								datod="SETENTA Y ";
								break;
							case 8:
								datod="OCHENTA y ";
								break;
							case 9:
								datod="NOVENTA Y ";
								break;
							case 10:
								datod="CIEN";
								break;
					
							default:
								datod="invalido";
								break;	
							}
							 
							System.out.println( datod+datou);
					 }
				
			 }
			
			}
		
			}
}
		

