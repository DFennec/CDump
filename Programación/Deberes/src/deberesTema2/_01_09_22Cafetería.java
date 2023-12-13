package deberesTema2;

import java.util.Scanner;

public class _01_09_22Cafetería {
static double americano=0.95;
static double capuccino=1.2;
static double latte=1.5;
static double crema=0.8;
static double chocolate=0.8;
static double precio=0;
static double Extrale=0;
static double Cafele=0;
static int Extra=0;
static int Cafe=0;
	public static void main(String[] args) {
	System.out.println("¿Qué tipo de café desea?"+"\n1. Americano"+"\n2. Capuccino"+"\n3. Latte");
	Scanner caf= new Scanner(System.in);
	Cafe= caf.nextInt();
	System.out.println("¿Desea algún extra?"+"\n1. Crema"+"\n2. Chocolate"+"\n3. No quiero ninguno");
	Scanner xtra= new Scanner(System.in);
	Extra= xtra.nextInt();
	calculos();
	}
public static void calculos(){
	switch (Cafe) {
	case 1:{
		Cafele=americano;
		break;
	}
	case 2:{
		Cafele=capuccino;
		break;
	}
	case 3:{
		Cafele=latte;
		break;
	}default:{
		System.out.println("Opción no válida.");
		break;
	}
	}
	switch (Extra) {
	case 1:{
		Extrale=crema;
		break;
	}case 2:{
		Extrale=chocolate;
		break;
	}case 3:{
		Extrale=0;
		break;
	}default:{
		System.out.println("Opción no válida.");
		break;
}
}
precio=Cafele+Extrale;
System.out.println("Precio total: "+precio+"€\nDesglose:\n+"+Cafele+"€\n+"+Extrale+"€");
}
}