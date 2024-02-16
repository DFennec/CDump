package ejercicioConvertidor;

public abstract class API implements Convertidor{
	private String archivo;
	private String datos;
	public API(String archivo, String datos){
		this.archivo=archivo;
		this.datos=datos;
	}
	public String getArchivo() {
		return archivo;
	}
	public String getDatos() {
		return datos;
	}
	public void convertir(String datos) {
		if (archivo.contains("XML")) {
			
		}else if (archivo.contains("JSON")){
			
		}
	}
}