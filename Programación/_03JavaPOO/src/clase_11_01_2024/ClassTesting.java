package clase_11_01_2024;

public class ClassTesting {

	public static void main(String[] args) {
		Pedido Bicicleta = new Pedido("Perico el de los palotes");
		Pedido Casa = new Pedido("Perico el de los palotes");
		Bicicleta.getId();
		Casa.getId();
		Bicicleta.getEstado();
		Bicicleta.getCliente();
		Bicicleta.avanzarFase();
	}

}
