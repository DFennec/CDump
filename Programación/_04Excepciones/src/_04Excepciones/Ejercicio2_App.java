package _04Excepciones;

public class Ejercicio2_App {
	public static void main(String[] args) {
		Ejercicio2_GestionProductos tienda1= new Ejercicio2_GestionProductos();

		tienda1.añadirProducto("Maravilla Cósmica",50);
		tienda1.añadirProducto("Maravilla",1);
		tienda1.añadirProducto("Nada",-50);

		tienda1.consultarStock("Maravilla Cósmica");
		tienda1.consultarStock("Caracola");
		tienda1.consultarStock("Maravilla");
	}
}