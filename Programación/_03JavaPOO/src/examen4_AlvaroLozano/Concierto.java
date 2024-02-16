package examen4_AlvaroLozano;

import java.time.LocalDate;

public class Concierto extends Evento{
	private String generoMusical;

	public Concierto(String nombreEvento, String TipoEvento, LocalDate fechaEvento,int costoBase,String generoMusical) {
		super(nombreEvento, TipoEvento, fechaEvento, costoBase);
		this.generoMusical=generoMusical;
	}
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("\n Género : "+generoMusical+"\n");
	}
	public int costoTotal() {
		int costoTotal;
	if (generoMusical.equalsIgnoreCase("rock")) {
		costoTotal=(getCostoBase()+100);/*+100 si es rock*/ 
	}else if(generoMusical.equalsIgnoreCase("clasica")||generoMusical.equalsIgnoreCase("clásica")) {
		costoTotal=(getCostoBase()+50);/*+50 si es clasica*/
	}else {
		costoTotal=(getCostoBase()+150);/*+150 para los demás*/ 
	}
	return costoTotal;
	}
}