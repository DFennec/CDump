package _04Excepciones;

import java.util.ArrayList;

public class Ejercicio3_GestionBiblioteca {
	
	private ArrayList<Ejercicio3_Libro> libros;
	
	public Ejercicio3_GestionBiblioteca() {
		this.libros=new ArrayList<Ejercicio3_Libro>();
	}
	
	public void agregarLibro(Ejercicio3_Libro libro) {
		libros.add(libro);
	}
	
	public void prestarLibro(Ejercicio3_Libro libro) {
		try {
			if (libro.isPrestado()) {
				throw new Ejercicio3_LibroNoDisponibleException("Excepcion: el libro ya está prestado.");
			}
			System.out.println("Libro prestado correctamente.");
			libro.setPrestado(true);
		}catch (Ejercicio3_LibroNoDisponibleException E) {
			System.out.println(E.getMessage());
		}
	}
	
	public void devolverLibro(Ejercicio3_Libro libro) {
		try {
			if (libro.getDiasPrestamo()<0) {
					throw new Ejercicio3_DevolucionTardiaException("Excepcion: libro devuelto fuera de fecha.");
				}
			}catch(Ejercicio3_DevolucionTardiaException E) {
				System.out.println(E.getMessage());
			}
		System.out.println("Libro devuelto.");
		libro.setPrestado(false);
	}
	
}