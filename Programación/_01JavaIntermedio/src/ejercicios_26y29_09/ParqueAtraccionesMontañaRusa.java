package ejercicios_26y29_09;
import java.util.Scanner;
public class ParqueAtraccionesMontañaRusa {

	public static void main(String[] args) {
//		Crea un programa que verifique si un individuo puede montar una montaña rusa.
//
//		Las restricciones son que debe tener al menos 12 años y medir más de 1.20m.
//
//		Indica al usuario si tiene permitido el acceso o no.
		System.out.println("Indique su altura: ");
		Scanner sc = new Scanner(System.in);
		double altura=sc.nextDouble();
		System.out.println("Indique su edad: ");
		int edad=sc.nextInt();
		boolean mayor= edad>=12;
		boolean alto= altura>=1.2;
		if(mayor && alto) {
			System.out.println("¡Adelante!");
		}else {
			System.out.println("Lo lamento, no puede montar.");
		}
	}

}
