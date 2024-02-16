package herencia;

import java.util.ArrayList;

import ejercicios30_01_2024.Vehiculo;

public class Gerente extends Empleado{
private String departamentoGestionado;

	public Gerente(String nombre, String departamento, double salario, String departamentoGestionado) {
	super(nombre, departamento, salario);
	this.departamentoGestionado = departamentoGestionado;
	}
	public double calcularBonoAnual() {
		calcularBono();
		double BonoAnual=calcularBono()*12;
		return BonoAnual;
	}
	public void gestionarEquipo() {
		System.out.println("Gestionando equipo "+departamentoGestionado+"...");
	}
	public static void main(String[] args) {
		Gerente gerenteProfesores = new Gerente("Paco","Gerentes",2000,"Profesores");
		System.out.println(gerenteProfesores.calcularBonoAnual());
		gerenteProfesores.gestionarEquipo();
	}
}
