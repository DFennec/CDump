package _06Lección;
import java.util.Scanner;
public class UpperLowerCaseReplace {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String nombre;
	String idioma;
	System.out.print("Hola, ¿cómo te llamas? ");
	nombre=sc.nextLine();
	System.out.print("Por favor elige un idioma: español/inglés/francés: ");
	idioma=sc.nextLine();
	
	idioma=idioma.toLowerCase();// o .toUpperCase
	if (idioma.equalsIgnoreCase("ingles")) {
		idioma=idioma.replace("e", "é");
	} else if(idioma.equalsIgnoreCase("frances")) {
		idioma=idioma.replace("e","é");
	}
	switch(idioma) {
	case "español":
		System.out.println("Hola, " + nombre);
		break;
	case "francés":
		System.out.println("Bonjour, " + nombre);
		break;
	case "inglés":
		System.out.println("Hello, " + nombre);
		break;
	default:
		System.out.println("Error: no hablo dicho idioma.");
		break;
	}
	}

}
