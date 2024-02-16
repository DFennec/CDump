package examen4_AlvaroLozano;

import java.time.LocalDate;

public class Obra extends Evento{
	private double duracion;
	public Obra(String nombreEvento, String TipoEvento, LocalDate fechaEvento,int costoBase,double duracion) {
		super(nombreEvento, TipoEvento, fechaEvento, costoBase);
		this.duracion=duracion;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("\n Duración : "+duracion+" h\n");
	}
	public int costoTotal() {
		int costoTotal;
		costoTotal=(int) (getCostoBase()+(duracion*100));/*100/h*/
		return costoTotal;
	}
}