package ejercicios_26y29_09;
import java.util.Scanner;
public class ParqueDescuento {

	public static void main(String[] args) {
		double precio=45.54;
		String residente;
		int edad=0;
		System.out.println("¿Eres residente en España?");
		Scanner sc= new Scanner (System.in);
		residente=sc.nextLine();
		System.out.println("¿Qué edad tienes?");
		edad=sc.nextInt();
		boolean esR= residente.equalsIgnoreCase("si");
		boolean esM15= edad<=15;
		if(!esR && !esM15) {
			System.out.println("¡Te corresponde un descuento del 10%!\n");
			System.out.println("Precio normal: "+precio);
			precio=precio*0.9;
			System.out.println("Tu precio: "+precio);
		}
		else{
			System.out.println("Precio de la entrada: "+precio);
		}
		
	}

}
