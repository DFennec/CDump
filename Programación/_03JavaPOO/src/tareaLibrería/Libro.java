package tareaLibrería;
import java.util.ArrayList;
public class Libro {
	private String titulo;
	private String autor;
	private boolean prestado;
	private String prestatario;
	private static ArrayList<String> usuarios = new ArrayList<String>();
	
	public Libro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
		this.prestado=false;
		this.prestatario="";
	}
	
	public void prestarLibro(String prestatario){
		if (this.prestado==false) {
			this.prestado=true;
			this.prestatario=prestatario;
			System.out.println("Libro prestado.");
			usuarios.add(prestatario);
		}else {
			System.out.println("Ese libro no está disponible.");
		}
	}

	public void devolverLibro(){
		if (this.prestado==true) {
			this.prestado=false;
			this.prestatario="";
			System.out.println("Libro devuelto.");
		}else {
			System.out.println("Ese libro ya está en la biblioteca.");
		}
	}
	public void disponibilidadLibro() {
		if (this.prestado==false) {
			System.out.println("Libro disponible.");
		}else {
			System.out.println("Libro no disponible.");
			System.out.println("\n"+ this.prestatario+" tiene este libro. \n");
			System.out.println("Estos son los usuarios que tenemos registrados: ");
			System.out.println(usuarios);
		}
	}
	
}//class
