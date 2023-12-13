package examen_2;
import java.util.Scanner;
public class AlvaroLozano {

	public static void main(String[] args) {
		/*EJ 1*/
		Scanner sc = new Scanner (System.in);
		int[] tempSemana= new int [7];
		int dia=0;
		double avg=0;
		int abvAvg=0;
		for (int i=0;i<tempSemana.length;i++) {
			System.out.println("Introduce la temperatura del día "+(i+1)+" de la semana: ");
			dia=sc.nextInt();
			tempSemana[i]=dia;
		}
		System.out.println("Estos son los datos que has introducido para cada día de la semana: ");
		for (int i=0;i<tempSemana.length;i++) {
			System.out.print(" "+tempSemana[i]+"ºC|");
		}
		/*EJ 2*/
		if(tempSemana[6]<tempSemana[0]) {
			System.out.println("\n                                          Se ha detectado que la temperatura del lunes es mayor que la del domingo.\n                                          Igualando temperatura del domingo a la del sábado.");
			tempSemana[6]=tempSemana[5];
			for (int i=0;i<tempSemana.length;i++) {
				System.out.print(" "+tempSemana[i]+"ºC|");
			}
		}
		/*EJ 3*/
		for (int i=0;i<tempSemana.length;i++) {
			avg+=tempSemana[i];
		}
		avg=(avg/7);
		System.out.println("\nEl promedio de temperaturas de la semana es: "+String.format("%.2f",avg)+"ºC");
		for (int i=0;i<tempSemana.length;i++) {
			if (avg<tempSemana[i]){
				abvAvg++;
			}
		}
		if (abvAvg==1) System.out.println("La temperatura estuvo "+abvAvg+" día sobre el promedio de la semana.");
		else System.out.println("La temperatura estuvo "+abvAvg+" días sobre el promedio de la semana.");
	}
}