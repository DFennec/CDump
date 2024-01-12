package clase_09_01_2024;
	public class Empleado{
		private String id;
		private String nombre;
		private boolean acceso;
		private static int empleadosDentro=0;
		
		public Empleado(String id, String nombre) {
			this.id=id;
			this.nombre=nombre;
			this.acceso=false;
		}
		//getters
		public int getEmpleadosDentro(){
			return empleadosDentro;
		}
		public String getId(){
			return this.id;
		}
		public String getNombre(){
			return this.nombre;
		}
		public void getAcceso(){
			if (acceso) {	
				System.out.println("Dentro");
			}
			if (!acceso) {
				System.out.println("Fuera");
			}
		}
		//setters
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		public void setId(String id){
			this.id=id;
		}
		//métodos
		public void Salir() {
			if (acceso) {
				this.acceso=false;
				empleadosDentro--;
			}
		}
		public void Entrar() {
			if (!acceso) {
				this.acceso=true;
				empleadosDentro++;
			}
		}
	}//EmpleadoClass