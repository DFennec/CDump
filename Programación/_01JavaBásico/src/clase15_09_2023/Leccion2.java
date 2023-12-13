package clase15_09_2023;

import java.util.Scanner;

public class Leccion2 {

	public static void main(String[] args) {
	
		int edad=0;
		String nombre="";
		
		//Scanner (a.k.a. comando para input)
		
		Scanner ed = new Scanner(System.in);//clase para capturar datos por consola
		Scanner nm = new Scanner(System.in);//Hay que utilizar un scanner por cada dato que queramos introducir
		
		System.out.println("Dime tu edad: ");
		edad = ed.nextInt();
		System.out.println("Dime también tu nombre: ");
		nombre = nm.nextLine();
		System.out.println(nombre+ ", no aparentas tener  "+ edad);
		
		//Switch
		int option=0;
		Scanner sw = new Scanner(System.in);
		System.out.println("¿A dónde quieres ir? \n1. Módulo 1 \n2. Módulo 1 \n3. Salir");
		option = sw.nextInt();
		switch(option){
		case 1:{
			System.out.println("Estás en el módulo 1.");
			break; 
		}
		case 2:{
			System.out.println("Estás en el módulo 2.");
			break; 
		}
		case 3:{
			System.out.println("¡Hasta luego!");
			break; 
		}
		default:{
			System.out.println("¡Error!");
			break;
		}
		}
	}
	}