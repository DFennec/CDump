package tipoExamenHerenciaPolimorfismo;

public class Camion extends Transporte{
	private int numeroEjes;
	public Camion(String tipo, String matricula, int capacidadCarga, int numeroEjes) {
		super(tipo, matricula, capacidadCarga);
		this.numeroEjes=numeroEjes;
	}
	public double calcularCostoEnvio(int carga) {
		double precio=(carga*50)+100;
		System.out.println("El coste de enviar "+carga+" kg por camión es de: "+precio+" USD \n");
		return precio;
	}
	public void mostrarInfo() {
		System.out.println("Número de ejes: "+getNumeroEjes()+"\n");
	}
	public int getNumeroEjes() {
		return numeroEjes;
	}
}