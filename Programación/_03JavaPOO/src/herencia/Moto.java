package herencia;

public class Moto extends Vehiculo{
	private boolean sidecar;

	public Moto(String marca, String modelo, int año, boolean sidecar) {
		super(marca, modelo, año);
		this.sidecar = sidecar;
	}
}