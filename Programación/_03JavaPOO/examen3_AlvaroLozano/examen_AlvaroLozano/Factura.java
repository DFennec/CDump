package examen_AlvaroLozano;

import java.time.LocalDate;

public class Factura {
	private static int contFactura=0;
	private int nFactura;
	private Producto productosVendidos;
	private EstadoFacturas estado;
	private LocalDate fecha;
	public Factura(Producto productosVendidos) {
		this.productosVendidos=productosVendidos;
		this.nFactura=++contFactura/2;
		this.estado=EstadoFacturas.GENERADA;
		this.fecha=LocalDate.of(2024, 01, 26);
	}
	public int getnFactura() {
		return nFactura;
	}
	public Producto getProductosVendidos() {
		return productosVendidos;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public EstadoFacturas getEstado() {
		return estado;
	}
	public void setEstado(EstadoFacturas estado) {
		this.estado = estado;
	}
}//clase