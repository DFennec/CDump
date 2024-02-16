package examen_AlvaroLozano;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {
	private ArrayList<Producto> productos;
	private String nombre;
	private ArrayList<Factura> ventas;
	public Tienda(String nombre) {
		this.nombre=nombre;
		this.productos=new ArrayList<>();
		this.ventas=new ArrayList<>();
	}
	public void añadirProducto(Producto producto) {
		productos.add(producto);
		System.out.println(producto.getNombre()+" añadido");
	}
	public void vender(Producto producto) {
		ventas.add(generarFactura(producto));
		productos.remove(producto);
		System.out.println(producto.getNombre()+" vendido");
		System.out.println("Factura #"+Integer.toString(generarFactura(producto).getnFactura()));
	}
	private Factura generarFactura(Producto producto) {
		Factura facturaNueva=new Factura(producto);
		return facturaNueva;
	}
	public void verFacturasGeneradas(LocalDate fecha) {
		ArrayList<Factura> generadas= new ArrayList<>();
		for (Factura factura : ventas) {
			if (factura.getEstado() == EstadoFacturas.GENERADA && factura.getFecha().equals(fecha)) {
				generadas.add(factura);
			}
		}
		System.out.println("Facturas generadas: ");
		for (Factura factura : generadas) {
			System.out.println(factura.getnFactura()+1+". "+factura.getProductosVendidos().getNombre()+" | "+factura.getProductosVendidos().getPrecioUnitario()+" |"+factura.getFecha());
		}
	}
	public void verFacturasPorCobrar(LocalDate fecha) {
		ArrayList<Factura> porcobrar= new ArrayList<>();
		for (Factura factura : ventas) {
			if (factura.getEstado() == EstadoFacturas.PORCOBRAR && factura.getFecha().equals(fecha)) {
				porcobrar.add(factura);
			}
		}
		System.out.println("Facturas por cobrar: ");
		for (Factura factura : porcobrar) {
			System.out.println(factura.getnFactura()+factura.getProductosVendidos().getPrecioUnitario());
		}
		if (porcobrar.isEmpty()) {
			System.out.println("No hay facturas por cobrar");
		}
	}
}//clase