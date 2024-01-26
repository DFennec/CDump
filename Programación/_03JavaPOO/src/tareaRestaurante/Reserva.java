package tareaRestaurante;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Reserva {
	private LocalDateTime fecha;
	private int asistentes;
	private String cliente;
	private Mesa mesa;
	public Reserva(Mesa mesa, int asistentes, String cliente){
		this.fecha= LocalDateTime.now();
		this.asistentes= asistentes;
		this.cliente= cliente;
		this.mesa = mesa;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public int getAsistentes() {
		return asistentes;
	}
	public String getCliente() {
		return cliente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void confirmarReserva(ArrayList reservas) {
		int mesatemp=mesa.getNumero();
		String concatDatos=Integer.toString(mesatemp)+" | "+this.getCliente();
		reservas.add(concatDatos);
	}
}