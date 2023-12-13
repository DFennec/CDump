package clase2;

public class Ejercicio4Arrays {

	public static void main(String[] args) {
		int [] numeros = {3,5,20,0,18};
		int campeon =0;
		int campeonporelfinal=0;
			campeonporelfinal=numeros[0];
			campeon=numeros[0];
		for (int i = 1; i < (numeros.length);i++) {
			if (campeon<numeros[i]) {
				campeon=numeros[i];
			}
			if (campeonporelfinal>numeros[i]){
				campeonporelfinal=numeros[i];
			}
		}
		System.out.println("El mayor número de la lista es: "+ campeon);
		System.out.println("El menor número de la lista es: "+ campeonporelfinal);
	}

}