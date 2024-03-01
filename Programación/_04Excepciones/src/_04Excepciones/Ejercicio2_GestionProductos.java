package _04Excepciones;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Ejercicio2_GestionProductos {
	private ArrayList<Ejercicio2_Producto> productos;
	public Ejercicio2_GestionProductos() {
		this.productos=new ArrayList<Ejercicio2_Producto>();
	}
	public void añadirProducto(String nombre, int cantidad) {
		try {
		if (cantidad < 0) {
			throw new Ejercicio2_CantidadInvalidaException("Excepcion: Cantidad menor que 0.");
		}
		}catch (Ejercicio2_CantidadInvalidaException excp) {
			System.out.println(excp.getMessage());
		}
			Ejercicio2_Producto p = new Ejercicio2_Producto(nombre,cantidad);
			productos.add(p);
	}
	public void consultarStock(String nombre){
		boolean existe=false;
		for (Ejercicio2_Producto producto : productos) {
			if (compararNombre(producto,nombre)) {
				System.out.println("Hay "+producto.getStock()+" unidad(es) de "+nombre);
				existe=true;
			}
	}
		try {
		if (!existe) {
			
			throw new NoSuchElementException("Excepcion: No existe un producto con ese nombre en stock.");
		}
		}catch (NoSuchElementException excp){
			System.out.println(excp.getMessage());
		}
}
	public boolean compararNombre(Ejercicio2_Producto producto,String nombre) {
		if ((producto.getNombre()).equals(nombre)) {
			return true;
		}
		return false;
	}
}