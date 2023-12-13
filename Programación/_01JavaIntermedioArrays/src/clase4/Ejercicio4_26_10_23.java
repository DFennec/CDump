package clase4;

public class Ejercicio4_26_10_23 {

	public static void main(String[] args) {
		String[] frutas1= {"Peras", "Manzanas", "Arándanos", "Mango"};
		String[] frutas2= {"Kiwi", "Fresas", "Frambuesas"};
		String[] frutasSuma= new String[(frutas1.length+frutas2.length)];
		int j =0;
		int tamMax= frutas1.length>frutas2.length ? frutas1.length : frutas2.length;
		for(int i = 0; i < tamMax; i++) {
			if (frutas1.length>i) {
				frutasSuma[j]=frutas1[i];
				j++;
			}
			if (frutas2.length>i) {
				frutasSuma[j]=frutas2[i];
				j++;
			}
		}
		for(int i=0;frutasSuma.length>i;i++){System.out.print(frutasSuma[i]+" | ");}
		
		}

	}