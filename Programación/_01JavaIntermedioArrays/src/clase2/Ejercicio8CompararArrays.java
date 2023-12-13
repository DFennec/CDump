package clase2;

public class Ejercicio8CompararArrays {

	public static void main(String[] args) {
		int[]numeros1 = {10,20,30,40,50};
		int[]numeros2 = {10,20,30,40,50};
		boolean sonIguales=true;
		if(numeros1.length == numeros2.length) {
			for(int i=0;i<numeros1.length;i++) {
				if (numeros1[i]!=numeros2[i]) {
					sonIguales=false;
				}
			}
		}else {
			sonIguales=false;
		}
		String resultado = sonIguales? "iguales" : "diferentes"; //operador ternario
	System.out.println("Los arrays son "+resultado+".");
	}
}