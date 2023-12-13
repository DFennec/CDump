package deberesTema2;

import java.util.Scanner;

public class ValidadorDeEdadParaVotar {

	public static void main(String[] args) {
	int edad;
	System.out.println("¿Qué edad tiene?");
	Scanner sc= new Scanner(System.in);
	edad=sc.nextInt();
	while(edad<18){
		System.out.println("Usted no puede votar. Debe ser mayor de edad para votar.");
		edad=sc.nextInt();
	}
	System.out.println("¡Usted puede votar en las próximas elecciones!");
	sc.close();
	}

}
