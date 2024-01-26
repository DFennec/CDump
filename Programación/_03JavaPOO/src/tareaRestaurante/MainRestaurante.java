package tareaRestaurante;

import java.util.ArrayList;

public class MainRestaurante {
	public static void main(String[] args) {
		ArrayList<Reserva> reservasRestaurante = new ArrayList<Reserva>(); 
		Mesa mesa1=new Mesa(1,4);
		Reserva reserva1=new Reserva(mesa1,4,"Paco");
		Mesa mesa2=new Mesa(2,8);
		Reserva reserva2=new Reserva(mesa2,8,"Carlos");
		Mesa mesa3=new Mesa(3,6);
		Reserva reserva3=new Reserva(mesa3,6,"Gynny");
		reserva1.confirmarReserva(reservasRestaurante);
		reserva2.confirmarReserva(reservasRestaurante);
		reserva3.confirmarReserva(reservasRestaurante);
		System.out.println(reservasRestaurante);
	}//main
}//class
