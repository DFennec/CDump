package clase2;

import java.util.Iterator;

public class Ejercicio7EliminarElemento {

	public static void main(String[] args) {
		int[]valores= new int[5];
		valores [0]=10;
		valores [1]=20;
		valores [2]=30;
		valores [3]=40;
		valores [4]=50;
		 for(int i=0;i<valores.length;i++) {
			 System.out.println(valores [i]);
			 }
		 System.out.println("\n");
		 for(int i=0;i<valores.length;i++) {
			 if (valores[i]==30){
				 valores[i]=-1;
			 }
			 System.out.println(valores [i]+", ");
			 }
	}
}