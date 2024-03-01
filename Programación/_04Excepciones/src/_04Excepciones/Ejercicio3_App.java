package _04Excepciones;

public class Ejercicio3_App {
	public static void main(String[] args) {
		
		Ejercicio3_Libro libritoBonito = new Ejercicio3_Libro("Libro Magico",14);
		Ejercicio3_Libro libroTarde = new Ejercicio3_Libro("Libro retraso",-4);
		
		Ejercicio3_GestionBiblioteca Biblioteca = new Ejercicio3_GestionBiblioteca();
		Biblioteca.agregarLibro(libritoBonito);
		Biblioteca.agregarLibro(libroTarde);
		
		Biblioteca.prestarLibro(libritoBonito);
		Biblioteca.prestarLibro(libritoBonito);
		
		Biblioteca.devolverLibro(libritoBonito);
		Biblioteca.devolverLibro(libroTarde);
		
	}
	
}