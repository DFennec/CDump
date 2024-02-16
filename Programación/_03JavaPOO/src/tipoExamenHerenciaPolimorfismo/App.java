package tipoExamenHerenciaPolimorfismo;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Camion camion1= new Camion("Megacamión","LOLXD",100000,16);
		Barco barco1= new Barco("Megabarco","matriculadebarco",250000,"China");
		Avion avión1= new Avion("Avioncito","LiL",100,"Motor a reacción vasco");
		ArrayList<Transporte> listaTransportes=new ArrayList <Transporte>();
		Gestor gestionTodo= new Gestor(listaTransportes);
		gestionTodo.agregarVehículo(camion1);
		gestionTodo.agregarVehículo(avión1);
		gestionTodo.agregarVehículo(barco1);
		gestionTodo.listarVehículos();
		gestionTodo.compararCosto(5000);
	}
}