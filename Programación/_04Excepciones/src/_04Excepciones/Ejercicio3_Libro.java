package _04Excepciones;

public class Ejercicio3_Libro {
	
	private String titulo;
	private boolean prestado;
	private int diasPrestamo;
	
	public Ejercicio3_Libro(String titulo, int diasPrestamo) {
		this.titulo=titulo;
		prestado=false;
		this.diasPrestamo=diasPrestamo;
	}
	
	public boolean isPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getDiasPrestamo() {
		return diasPrestamo;
	}
}