package tipoExamenHerenciaPolimorfismo;

public abstract class Transporte {
	private String tipo;
	private String matricula;
	private int capacidadCarga;
	public Transporte(String tipo, String matricula, int capacidadCarga){
		this.tipo=tipo;
		this.matricula=matricula;
		this.capacidadCarga=capacidadCarga;
	}
	
	public String getTipo() {
		return tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void mostrarInfo() {
		System.out.println("Tipo de transporte: "+getTipo()+"\nMatricula: "+getMatricula()+"\nCapacidad de carga: "+getCapacidadCarga()+"\n");
	}
	public abstract double calcularCostoEnvio(int carga);
}