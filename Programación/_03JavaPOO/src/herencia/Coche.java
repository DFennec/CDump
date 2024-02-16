package herencia;

public class Coche extends Vehiculo {
	private int puertas;

	public Coche(String marca, String modelo, int año, int puertas) {
		super(marca, modelo, año);
		this.puertas = puertas;
	}
	
}
