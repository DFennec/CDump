package herencia;

	public class Vehiculo {

		private String marca;
		private String modelo;
		private int año;
		public Vehiculo(String marca, String modelo, int año) {
			this.marca = marca;
			this.modelo = modelo;
			this.año = año;
		}
		
		public void arrancar() {
			System.out.println("Has arrancado el vehiculo:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
			System.out.println();
		}
		public void detener() {
			System.out.println("Has detenido el vehiculo:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
			System.out.println();
		}
		public void mostrarInfo() {
			System.out.println("Info:\n Marca - "+this.marca+"\n Modelo - "+this.modelo+"\n Año - "+this.año);
			System.out.println();
		}
}