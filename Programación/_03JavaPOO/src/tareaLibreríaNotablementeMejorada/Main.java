package tareaLibreríaNotablementeMejorada;

public class Main {

	public static void main(String[] args) {
		Libro libro1=new Libro("Libro1","AutorX");
		Libro libro2=new Libro("Libro2","AutorX");
		Libro libro3=new Libro("Libro3","AutorX");
		Biblioteca biblioteca1 = new Biblioteca("biblioteca madrid");
		biblioteca1.guardarLibro(libro1);
		biblioteca1.guardarLibro(libro2);
		biblioteca1.guardarLibro(libro3);
		biblioteca1.eliminarLibro(libro1);
		biblioteca1.consultarLibros();
	}
}//class