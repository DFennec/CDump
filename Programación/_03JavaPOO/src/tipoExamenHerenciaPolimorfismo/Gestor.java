package tipoExamenHerenciaPolimorfismo;

import java.util.ArrayList;

public class Gestor implements GestionVehículos{
	private ArrayList<Transporte> listaVehículos;
	
	public Gestor(ArrayList<Transporte> listaVehículos) {
		this.listaVehículos = listaVehículos;
	}

	public void agregarVehículo(Transporte vehiculo) {
		listaVehículos.add(vehiculo);
	}

	public void listarVehículos() {
		for (Transporte vehiculo : listaVehículos) {
			vehiculo.mostrarInfo();
		}
	}
	public void compararCosto(int carga) {
		for (Transporte vehiculo : listaVehículos) {
			if (carga<vehiculo.getCapacidadCarga()) {
				vehiculo.calcularCostoEnvio(carga);
			}else {
				System.out.println("El vehículo de tipo "+vehiculo.getTipo()+" no se puede comparar\npor tener una capacidad menor a la carga introducida. \n");
			}
		}
	}
	
}