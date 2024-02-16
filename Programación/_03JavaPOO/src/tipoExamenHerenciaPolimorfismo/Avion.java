package tipoExamenHerenciaPolimorfismo;

public class Avion extends Transporte{
	private String tipoMotor;
	public Avion(String tipo, String matricula, int capacidadCarga, String tipoMotor) {
		super(tipo, matricula, capacidadCarga);
		this.tipoMotor=tipoMotor;
	}
	public double calcularCostoEnvio(int carga) {
		double precio=(carga*100)+200;
		System.out.println("El coste de enviar "+carga+" kg por avión es de: "+precio+" USD \n");
		return precio;
	}
}