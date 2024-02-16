package tipoExamenHerenciaPolimorfismo;

public class Barco extends Transporte{
	private String bandera;
	public Barco(String tipo, String matricula, int capacidadCarga, String bandera) {
		super(tipo, matricula, capacidadCarga);
		this.bandera=bandera;
	}
	public double calcularCostoEnvio(int carga) {
		double precio=(carga*30)+200;
		System.out.println("El coste de enviar "+carga+" kg por barco es de: "+precio+" USD");
		return precio;
	}
}
