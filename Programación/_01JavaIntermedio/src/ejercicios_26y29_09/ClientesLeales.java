package ejercicios_26y29_09;
import java.util.Random;
import java.util.Scanner;
public class ClientesLeales {

	public static void main(String[] args) {
	Random rand = new Random();
	int price=rand.nextInt(100)+20;
	System.out.println("¿Cuántas veces ha comprado en los 6 meses?");
	Scanner sc= new Scanner(System.in);
	Scanner pg= new Scanner(System.in);
	int compras=sc.nextInt();
	boolean infiel= 3>compras;
	System.out.println("¿Ha devuelto algún artículo en ese periodo de tiempo?");
	String preg=pg.nextLine();
	boolean devoluciones= preg.equalsIgnoreCase("si");
	if(!devoluciones && !infiel){
		System.out.println("¡Le corresponde un descuento especial por su fidelidad!");
	}else{
		System.out.println("Su compra son: "+price+" €");
	}
	}
}