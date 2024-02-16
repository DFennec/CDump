package tipoExamen;

public enum Categoria {
	FICCION, NOFICCION, EDUCATIVO;
}
package ejercicio_restauranteV2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurante {
	String nombre;
	ArrayList<Reserva> reservas;
	ArrayList<Mesa> mesas;

	public Restaurante(String nombre, ArrayList<Mesa> mesas) {
		this.mesas = mesas;
		this.nombre = nombre;
		this.reservas = new ArrayList<>();
	}

	public int createReservation(LocalDateTime fechaReserva, String nombreCliente, int cantPersonas) {
		Mesa mesaDisponible = buscarMesaDisponible(fechaReserva, cantPersonas);
		if (mesaDisponible != null) {
			Reserva reserva = new Reserva(mesaDisponible.getCodMesa(), nombreCliente, fechaReserva, cantPersonas);
			reservas.add(reserva);
			return reserva.getCod();
		} else {
			return -1;
		}
	}

	private Mesa buscarMesaDisponible(LocalDateTime fechaReserva, int cantPersonas) {
		for (Mesa mesa : mesas) {
			if (cantPersonas <= mesa.getNumMaximo() && !isTableReserved(mesa, fechaReserva)) {
				return mesa;
			}
		}

		return null;
	}

	private boolean isTableReserved(Mesa mesa, LocalDateTime fechaReserva) {
		for (Reserva reserva : reservas) {
			if (reserva.getCodMesa() == mesa.getCodMesa() && reserva.getFechaReserva().equals(fechaReserva)) {
				return true;
			}
		}
		return false;
	}

	public void updateReservation(String nombreCliente, LocalDateTime fechaReserva, int cantPersonas) {
		Mesa mesaDisponible = buscarMesaDisponible(fechaReserva, cantPersonas);
		if (mesaDisponible != null) {
			Reserva reserva = buscarReserva(nombreCliente, fechaReserva);
			if (reserva != null) {
				reserva.setReservationInfo(mesaDisponible.getCodMesa(), fechaReserva, cantPersonas);
			} else {
				System.out.println("No existe una reserva con esos datos");
			}
		} else {
			System.out.println("NO hay mesas disponibles para esa fecha/hora");
		}
	}

	private Reserva buscarReserva(String nombreCliente, LocalDateTime fechaReserva) {
		for (Reserva reserva : reservas) {
			if (reserva.getNombreCliente().equalsIgnoreCase(nombreCliente)
					&& reserva.getFechaReserva().equals(fechaReserva)) {
				return reserva;
			}
		}
		return null;
	}

	public void cancelReservation(String nombreCliente, LocalDateTime fechaReserva) {
		Reserva reserva = buscarReserva(nombreCliente, fechaReserva);
		if (reserva != null) {
			reservas.remove(reserva);
		} else {
			System.out.println("No existe una reserva con esos datos");
		}
	}

}

package ejercicio_restauranteV2;

import java.time.LocalDateTime;

public class Reserva {

	private int cod;
	public static int contReservas;
	private int codMesa;
	private String nombreCliente;
	private LocalDateTime fechaReserva;
	private int cantPersonas;

	public Reserva(int codMesa, String nombreCliente, LocalDateTime fechaReserva, int cantPersonas) {
		this.cod = ++contReservas;		
		this.nombreCliente = nombreCliente;
		setReservationInfo(codMesa,fechaReserva, cantPersonas );
	}
	
	public void setReservationInfo(int codMesa, LocalDateTime fechaReserva, int cantPersonas) {
		this.codMesa = codMesa;
		this.fechaReserva = fechaReserva;
		this.cantPersonas = cantPersonas;
	}

	public int getCod() {
		return cod;
	}

	public void setFechaReserva(LocalDateTime fechaReserva) {
		this.fechaReserva = fechaReserva;

	}
	
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	
	public void setCodMesa(int codMesa){
		this.codMesa = codMesa;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public LocalDateTime getFechaReserva() {
		return fechaReserva;
	}

	public int getCodMesa() {
		return codMesa;
	}
	
}