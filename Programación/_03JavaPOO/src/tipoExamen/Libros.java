package tipoExamen;

public class Libros {
	private String titulo;
	private String autor;
	private int stock;
	private Categoria categoria;
public Libros(String titulo, String autor, int stock, Categoria categoria) {
	this.titulo=titulo;
	this.autor=autor;
	this.stock=stock;
	this.categoria=categoria;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
public void setNuevoStock(int ejemplaresNuevos) {
	this.stock=stock+ejemplaresNuevos;
}
}//class