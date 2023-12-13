package _05Lección;

import java.util.Scanner;

public class DefinirMétodos {
	
	static double precio=0;// en vez de declararlas en el main, podemos declararlas
	static double descuento=0;// en el global para que esta definición de variables
	//se aplique globalmetne.
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for (int c = 1; c <=2; c++) {
		System.out.println("Ingresa el precio del producto "+c);
		precio=sc.nextDouble();
		System.out.println("Ingresa el descuento del producto "+c);
		descuento = sc.nextDouble();
		calculoPrecioConDescuento();
	}
	}//main
	public static void calculoPrecioConDescuento() {
		precio = precio -(precio*descuento/100);
		System.out.println(precio);
	}//calculoPrecio
}//clase