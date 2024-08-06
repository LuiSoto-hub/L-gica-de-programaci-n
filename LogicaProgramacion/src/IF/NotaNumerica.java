package IF;
import java.util.Scanner;

public class NotaNumerica {

	public static void main(String[] args) {
		// 21. Pedir una nota numérica entera entre 0 y 10,
		//y mostrar dicha nota de la forma: cero, uno, dos, tres..
		int nota;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega la nota ");
		nota= entrada.nextInt();
		String calificacion;
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
			calificacion="TRES";
			break;
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
		default:
			calificacion="invalido";
			break;	
		}
		System.out.println("la calificacion es "+ calificacion);
		}
}


