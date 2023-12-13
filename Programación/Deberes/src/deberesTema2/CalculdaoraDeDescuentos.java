package deberesTema2;

import java.util.Scanner;

public class CalculdaoraDeDescuentos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner dsc=new Scanner(System.in);
		System.out.println("¿Qué día de la semana es?");
		String day=dsc.nextLine();
		boolean typoA=day.equalsIgnoreCase("miercoles");
		boolean typoB=day.equalsIgnoreCase("sabado");
		if (typoA) {
			day="miércoles";
		}else if(typoB){
			day="sábado";
		}
		if (day.equals("miércoles")||day.equals("sábado")) {System.out.println("\n¡El "+day+" hay descuento!");}
		System.out.println("Por favor, introduce el precio del artículo:");
		double price=sc.nextDouble();
		if (day.equals("miércoles")) {
			price=price*0.85;
			System.out.println("Los "+day+" aplicamos un 15% de descuento a nuestros clientes:\n Precio final: "+price+" €");
		}else if (day.equals("sábado")) {
			price=price*0.90;
			System.out.println("Los "+day+"s aplicamos un 10% de descuento a nuestros clientes:\n Precio final: "+price+" €");
		}else {
			System.out.println("Precio final: " +price+" €");
			}
	}

}
