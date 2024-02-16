package examen4_AlvaroLozano;

import java.util.ArrayList;

public class Gestor {
	private ArrayList<Evento> listaEventos;
	public Gestor(ArrayList listaEventos) {
		this.listaEventos=listaEventos;
	}
	public void agregarEvento(Evento evento) {
		listaEventos.add(evento);
	}
	public void listarEventos() {
		for (Evento evento : listaEventos) {
			System.out.println("--- Evento "+evento.getNombreEvento()+" ---\n");
			evento.mostrarInfo();
			System.out.println(" Costo total: "+evento.costoTotal()+" €\n");
		}
	}
}