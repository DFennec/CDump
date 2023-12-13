package lección3;

import java.util.Scanner;

public class CapturaDatos {

	public static void main(String[] args) {
		
		String nombre = "";
		
		
		//clase para captura datos por consola
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor dime tu nombre");
		
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
		
		int edad =0;
		System.out.println("Por favor dime tu edad");
		edad = sc.nextInt();
		
		double salario =0;
//		System.out.println("Por favor dime tu salario");
//		salario = sc.nextDouble();
		
		if(edad >= 18) {
			System.out.println("Eres todo un adulto");
		}else {
			System.out.println("NO eres adulto");
		}
		
		
	
		
		
		
		
		

	}

}
