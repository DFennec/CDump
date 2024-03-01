package _04Excepciones;

public class GeneradoraExcepciones {
	public static void main(String[] args) {
		int[] tresNumeros= {0,1,2};
		try {
			tresNumeros[3]=41;
		}catch(ArrayIndexOutOfBoundsException A){
			System.out.println("Error: " +A+". No puedes meter a un array de tres espacios un cuarto valor");
		}

	}
}
