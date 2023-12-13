package examen_1;
import java.util.Scanner;
public class AlvaroLozano {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int salida=0;
		float nota=0.000f;
		float notatotal=0.000f;
		float media=0.000f;
		int i=0;
		
		while(salida!=-1) {
		i++;
		System.out.println("Introduce una nota:");
		nota=sc.nextFloat();
		while(nota<0||nota>10) {
			System.out.println("\nNota no válida.\nIntroduce una nota:");
			nota=sc.nextFloat();
			}
		if (media==0) {
			System.out.println("\nHas insertado: "+nota+".\n");
		}else {
			System.out.println("\nHas insertado: "+nota+".\n"+"\nTu nota media era de un "+media);}
		notatotal+=nota;
		media=notatotal/i;
		System.out.println("Ahora tu nota media es de un "+media);
		System.out.println("\nSi quieres salir, introduce '-1', si no introduce cualquier número entero:\n");
		salida=sc.nextInt();
		}
		System.out.println("\nHas salido del programa.");
		sc.close();
	}
}