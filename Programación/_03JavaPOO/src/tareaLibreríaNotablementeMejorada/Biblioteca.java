package tareaLibreríaNotablementeMejorada;
import java.util.ArrayList;
public class Biblioteca {
	static int u=0;
	private ArrayList <Libro> Libros;
	private String nombreBiblioteca;
	private int code;
	public Biblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca=nombreBiblioteca;
		this.code=u++;
		ArrayList<Libro> librosBiblioteca = new ArrayList<>();
	}
	public void guardarLibro(Libro titulo) {
		this.Libros.add(titulo);
	}
	public void eliminarLibro(Libro titulo) {
		this.Libros.remove(titulo);
	}
	public int consultarCodigo() {
		return this.code;
	}
	public String consultarBiblioteca() {
		return this.nombreBiblioteca;
	}
}
