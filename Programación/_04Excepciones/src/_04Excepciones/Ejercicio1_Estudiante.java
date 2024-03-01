package _04Excepciones;

import java.util.ArrayList;

public class Ejercicio1_Estudiante {
private String nombre;
private ArrayList<Double> calificaciones;

	public Ejercicio1_Estudiante(String nombre) {
		this.nombre=nombre;
		this.calificaciones=new ArrayList<Double>();
	}
	public void añadirCalificacion(double calificacion) throws Ejercicio1_CalificacionInvalidaException{
		if (calificacion>0 && calificacion<10) {
			calificaciones.add(calificacion);
		}else {
			if(calificacion<0) {
				throw new Ejercicio1_CalificacionInvalidaException("No se puede poner una calificación menor a 0");
			}else {
				throw new Ejercicio1_CalificacionInvalidaException("No se puede poner una calificación mayor a 10");
			}
		}
	}
	public void verCalificaciones() {
		System.out.println(calificaciones);
	}
}