package herencia;

import java.util.ArrayList;

public class Empleado {
	public static ArrayList<Empleado> empleados= new ArrayList<Empleado>();
	private String nombre;
	private String departamento;
	private double salario;
	public Empleado (String nombre, String departamento, double salario) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
		empleados.add(this);
	}
	public void mostrarInfo() {
		System.out.println("Info:\n Nombre - "+this.nombre+" | Departamento - "+this.departamento+" | Salario - "+this.salario+" | Bono - "+calcularBono());
		System.out.println();
	}
	public double calcularBono() {
		double bono= this.salario*0.2;
		return bono;
	}
	public String getDepartamento() {
		return departamento;
	}
	public static void main(String[] args) {
		
	}
}