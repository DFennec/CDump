package _04Excepciones;

public class Ejercicio1_SisCalificaciones {
	public static void main(String[] args){
		Ejercicio1_Estudiante carlitos= new Ejercicio1_Estudiante("Carlos");
		try {
			carlitos.añadirCalificacion(9.3);
			carlitos.añadirCalificacion(-1);
			carlitos.añadirCalificacion(10.3);
			carlitos.añadirCalificacion(7);
		}catch (Ejercicio1_CalificacionInvalidaException excp){
			System.out.println("Error en: "+ excp);
		}
		try {
			carlitos.añadirCalificacion(10.3);
			carlitos.añadirCalificacion(7);
		}catch (Ejercicio1_CalificacionInvalidaException excp){
			System.out.println("Error en: "+ excp);
		}
		try {
			carlitos.añadirCalificacion(7);
		}catch (Ejercicio1_CalificacionInvalidaException excp){
			System.out.println("Error en: "+ excp);
		}
		carlitos.verCalificaciones();
	}
}