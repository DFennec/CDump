package clase_11_01_2024;

public class Pedido {
	private static int cId=100;
	private int id;
	private String cliente;
	private EstadoPedido estado;
	public Pedido(String cliente) {
		this.cliente=cliente;
		this.id=cId++;
		this.estado=EstadoPedido.PENDIENTE;
	}
	public void avanzarFase() {
		System.out.println("El pedido estaba: "+ this.estado);
		if (this.estado==EstadoPedido.PENDIENTE) {
			this.estado=EstadoPedido.PROCESADO;
		}else if (this.estado==EstadoPedido.PROCESADO){
			this.estado=EstadoPedido.ENVIADO;
		}else{
			this.estado=EstadoPedido.ENTREGADO;
		}
		System.out.println("El pedido está: "+ this.estado);
	}
	public EstadoPedido getEstado() {
		System.out.println(this.estado);
		return this.estado;
	}
	public int getId() {
		System.out.println(this.id);
		return this.id;
	}
	public String getCliente() {
		System.out.println(this.cliente);
		return this.cliente;
	}
}
