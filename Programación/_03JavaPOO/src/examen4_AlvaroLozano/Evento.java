package examen4_AlvaroLozano;

import java.time.LocalDate;

public abstract class Evento {
	private String nombreEvento;
	private String TipoEvento;
	private LocalDate fechaEvento;
	private int costoBase;
	public Evento(String nombreEvento, String TipoEvento, LocalDate fechaEvento,int costoBase) {
		this.nombreEvento=nombreEvento;
		this.TipoEvento=TipoEvento;
		this.fechaEvento=fechaEvento;
		this.costoBase=costoBase;
	}
	public void mostrarInfo() {
		System.out.println("Evento: " + nombreEvento + "\n Tipo de evento: " + TipoEvento + "\n Fecha: " + fechaEvento+ "\n Costo: " + costoBase+" €");
	}
	public int getCostoBase() {
		return costoBase;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}
	public abstract int costoTotal();
}