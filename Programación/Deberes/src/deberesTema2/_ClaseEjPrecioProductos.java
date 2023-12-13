package deberesTema2;
import java.util.Scanner;
public class _ClaseEjPrecioProductos {

	public static void main(String[] args) {
		//Producto 1
	System.out.println("Introduce el precio del artículo: ");
	Scanner discount= new Scanner (System.in);
	Scanner price= new Scanner (System.in);
	double precioini=price.nextDouble();
	double preciofin=0;
	System.out.println("Introduce el descuento del artículo: ");
	double disc=discount.nextDouble();
	preciofin=precioini*(1-disc/100);
	System.out.println(preciofin+" es el precio final.");
	//Producto 2
	System.out.println("Introduce el precio del artículo: ");
	Scanner discount2= new Scanner (System.in);
	Scanner price2= new Scanner (System.in);
	double precioini2=price2.nextDouble();
	double preciofin2=0;
	System.out.println("Introduce el descuento del artículo: ");
	double disc2=discount2.nextDouble();
	preciofin2=precioini2*(1-disc2/100);
	System.out.println(preciofin2+" es el precio final.");
	//Producto 3
	System.out.println("Introduce el precio del artículo: ");
	Scanner discount3= new Scanner (System.in);
	Scanner price3= new Scanner (System.in);
	double precioini3=price3.nextDouble();
	double preciofin3=0;
	System.out.println("Introduce el descuento del artículo: ");
	double disc3=discount3.nextDouble();
	preciofin3=precioini3*(1-disc3/100);
	System.out.println(preciofin3+" es el precio final.");
	}
}
