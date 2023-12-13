package clase15_09_2023;

public class Leccion {

	public static void main(String[] args) {
		//Tipos de datos
		
		//Números (enteros)
		byte nb = 126; //ocupa máx 8 bits (un número que no supere 2^8-1)
		short ns = 6100;//ocupa máx 16 bits (un número que no supere 2^16-1)
		int ni= 2900;//ocupa máx 32 bits (un número que no supere 2^32-1)
		long nl= 4100000;//ocupa máx 64 bits (un número que no supere 2^64-1)
		
		//Números (decimales)
		float decimalFloat = 1.0f;
		double decimalDouble= 1.0;
		
		//Texto
		char c = 'a';
		String nombre = "Álvaro";
		
		//Lógicos
		boolean estoyEnClase = true;//o false
		
		boolean asistirPartido = false;
		
		boolean haceSol = true;
		
		boolean juegaMiEquipo = true;
		
		asistirPartido = haceSol && juegaMiEquipo;
		
		System.out.println("Iré al partido? "+asistirPartido);
		int num= 5;
		System.out.println(num+"."+" opción");
		System.out.println("Opción: "+num);
		int edadAriel = 22;
	}

}