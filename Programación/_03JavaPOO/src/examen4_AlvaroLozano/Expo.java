package examen4_AlvaroLozano;

import java.time.LocalDate;

public class Expo extends Evento{
	private String tipoArte;

	public Expo(String nombreEvento, String TipoEvento, LocalDate fechaEvento,int costoBase,String tipoArte) {
		super(nombreEvento, TipoEvento, fechaEvento, costoBase);
		this.tipoArte=tipoArte;
	}
	public int costoTotal() {
		int costoTotal;
		if (tipoArte.equalsIgnoreCase("moderno")) {
			costoTotal=(getCostoBase()+50);/*+50 si es moderno*/ 
		}else {
			costoTotal=(getCostoBase()+100);/*+100 para los demás*/ 
		}
		return costoTotal;
	}
}