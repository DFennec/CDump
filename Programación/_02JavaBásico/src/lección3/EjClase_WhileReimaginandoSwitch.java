package lección3;

import java.util.Scanner;

public class EjClase_WhileReimaginandoSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt = 0;

		System.out.println("Bienvenido, elige una opción");
		System.out.println("1. Ir módulo A");
		System.out.println("2. Ir módulo B");
		System.out.println("3. Salir");

		opt = sc.nextInt();
		
		while(opt!=3) {
			if(opt==1){
				System.out.println("\n   MÓDULO A");
				System.out.println("\n¿Quieres hacer algo más?");
				System.out.println("\n1. Permanecer en el módulo A");
				System.out.println("2. Ir al módulo B");
			}else if(opt==2){
				System.out.println("\n   MÓDULO B");
				System.out.println("\n¿Quieres hacer algo más?");
				System.out.println("\n1. Ir al módulo A");
				System.out.println("2. Permanecer en el módulo B");
			}else {
				System.out.println("\n "+opt+" No es una opción válida. Elige otro número:");
				System.out.println("1. Ir módulo A");
				System.out.println("2. Ir módulo B");
			}
			System.out.println("3. Salir");
			opt = sc.nextInt();
		}



	}

}
