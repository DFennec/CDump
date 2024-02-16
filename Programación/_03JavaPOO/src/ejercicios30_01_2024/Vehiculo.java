package ejercicios30_01_2024;

import java.util.ArrayList;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int año;
	public Vehiculo(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	public void arrancar() {
		System.out.println("Has arrancado el vehiculo:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
		System.out.println();
	}
	public void detener() {
		System.out.println("Has detenido el vehiculo:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
		System.out.println();
	}
	public void mostrarInfo() {
		System.out.println("Info:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
		System.out.println();
	}
	public static void main(String[] args) {
		Vehiculo coche1 = new Vehiculo("Ford","Fiesta",2000);
		Vehiculo coche2 = new Vehiculo("Fiat","500",2000);
		Vehiculo coche3 = new Vehiculo("Porsche","Coupé",1982);
		Vehiculo coche4 = new Vehiculo("Seat","Córdoba",1995);
		ArrayList<Vehiculo> coches= new ArrayList<>();
		coche1.mostrarInfo();
		coche2.mostrarInfo();
		coche3.mostrarInfo();
		coche4.mostrarInfo();
		
	}
}