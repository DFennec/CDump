package clase3;

import java.util.Scanner;

public class RerservaRefactorized {

	public static void main(String[] args) {
		String[] asientos = { "v1", "p1", "p2x", "v1", "v2", "p3", "p4", "p5", "v4" };

		System.out.println("Hola, buenvenido a nuestro sistema de reservas online \n");
		

		boolean reservado = true;
		String continuar = "si";

		while (reservado || continuar.equalsIgnoreCase("si")) {

			System.out.println("\n\rPor favor indica el número del asiento disponible que desea reservar");
			for (int i = 0; i < asientos.length; i++) {

				System.out.print((i + 1) + "[" + asientos[i] + "] ");

			}

			Scanner sc = new Scanner(System.in);

			int numAsiento = sc.nextInt();
			sc.nextLine();

			if (asientos[numAsiento - 1].contains("x")) {
				System.out.println("El asiento número " + numAsiento + " que has elegido se encuentra ocupado");
			} else {
				reservado = false;
				String codAsiento = asientos[numAsiento - 1];
				asientos[numAsiento - 1] = codAsiento + "x";
				System.out.println("Hemos reservado su asiento número " + numAsiento);
				System.out.println("¿Desea hacer otra reserva? : Si / No");
				continuar = sc.nextLine();

			}

		}

		for (int i = 0; i < asientos.length; i++) {

			System.out.print((i + 1) + "[" + asientos[i] + "] ");

		}

	}

}