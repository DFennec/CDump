package examen4_AlvaroLozano;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		ArrayList<Evento> listaEventos=new ArrayList <Evento>();
		Gestor gestorEventos= new Gestor(listaEventos);
		Obra obraTeatro = new Obra("Othelo", "Obra de teatro",LocalDate.now(),10,2);
		Concierto conciertoDeJavi = new Concierto ("Bon Jovi", "Concierto",LocalDate.of(2024, 12, 31),10,"rock");
		Expo tateModern = new Expo("Expresionismo", "Pinacoteca fea",LocalDate.of(2024, 5, 27),10,"moderno");
		gestorEventos.agregarEvento(obraTeatro);
		gestorEventos.agregarEvento(conciertoDeJavi);
		gestorEventos.agregarEvento(tateModern);
		gestorEventos.listarEventos();
	}//main
}//class