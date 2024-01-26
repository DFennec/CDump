package tipoExamen;

import java.util.ArrayList;

public class Libreria {	
	private ArrayList<Libros> listaLibros;
	private String nombre;
	
	public Libreria (String nombre) {
		this.nombre=nombre;
		listaLibros= new ArrayList<>();
	}
	private ArrayList librosPorCategoria(Categoria categoria){
		ArrayList <Libros> listaCategoria= new ArrayList <Libros>();
		for (Libros libro : listaLibros) {
			if (libro.getCategoria().equals(categoria)) {
				listaCategoria.add(libro);
			}
		}
		return listaCategoria;
	}
	public void registrarLibro(Libros libro) {
		listaLibros.add(libro);
	}
	public static void main(String[] args) {
		Libros libro1= new Libros("Hamlet","Shakespeare",2,Categoria.FICCION);
		Libros libro2= new Libros("Hale","Shakespeare",2,Categoria.FICCION);
		Libros libro4= new Libros("Ham","Shakespeare",2,Categoria.FICCION);
		Libros libro3= new Libros("Ha","Shakespeare",2,Categoria.FICCION);
		Libreria libreria1=new Libreria("Librería buenastardes");
		libreria1.registrarLibro(libro1);
		libreria1.registrarLibro(libro2);
		libreria1.registrarLibro(libro3);
		libreria1.registrarLibro(libro4);
		libreria1.librosPorCategoria(Categoria.FICCION);
	}//main
}//class