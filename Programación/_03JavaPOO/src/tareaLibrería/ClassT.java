package tareaLibrería;

public class ClassT {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Titulo","Autor");
		libro1.disponibilidadLibro();
		libro1.devolverLibro();
		libro1.prestarLibro("Pedro");
		libro1.disponibilidadLibro();
		Libro libro2 = new Libro("Titulo","Autor");
		libro2.prestarLibro("Juan");
		Libro libro3 = new Libro("Titulo","Autor");
		libro3.prestarLibro("Andrés");
		libro3.devolverLibro();
		libro2.disponibilidadLibro();
	}
}
