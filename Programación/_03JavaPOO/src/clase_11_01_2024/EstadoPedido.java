package clase_11_01_2024;

public enum EstadoPedido{
	PENDIENTE("01","Falta algún dato"), PROCESADO("02","Pendiente de envío"), ENVIADO("03","Sin entregar"), ENTREGADO("04","Ticket emitido");
	private String codigo;
	private String descripcion;
	private EstadoPedido(String codigo, String descripcion) {
		this.codigo=codigo;
		this.descripcion=descripcion;
	}
	public String getDescripcion(){
		return this.descripcion;
	}
}