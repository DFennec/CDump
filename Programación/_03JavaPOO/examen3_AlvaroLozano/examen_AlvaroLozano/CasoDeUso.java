package examen_AlvaroLozano;

import java.time.LocalDate;

public class CasoDeUso {

	public static void main(String[] args) {
		Producto zapatos = new Producto("Mocasines saltarines",250.22);
		Producto tacones = new Producto("Tacones",600.99);
		Tienda miTienda=new Tienda("Zapateria");
		miTienda.añadirProducto(zapatos);
		miTienda.añadirProducto(tacones);
		miTienda.vender(zapatos);
		miTienda.vender(tacones);
		miTienda.verFacturasGeneradas(LocalDate.of(2024, 01, 26));
		miTienda.verFacturasPorCobrar(LocalDate.of(2024, 01, 26));
	}//main
}//clase