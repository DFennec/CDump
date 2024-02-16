package herencia;

public class Director extends Empleado {
	private int accionesEmpresa;

	public Director(String nombre, String departamento, double salario, int accionesEmpresa) {
		super(nombre, departamento, salario);
		this.accionesEmpresa = accionesEmpresa;
	}
	public double calcularBonoAnual() {
		calcularBono();
		double BonoAnual=calcularBono()*14;
		return BonoAnual;
	}
}