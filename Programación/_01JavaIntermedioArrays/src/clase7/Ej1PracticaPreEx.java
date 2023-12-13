package clase7;
import java.util.Scanner;
public class Ej1PracticaPreEx {

	public static void main(String[] args) {
		String[] nombres= {"Sergio","Andrés","Álvaro","Sergio","Sergio","Daniel","Sergio"};
		int cont = 0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Ingresa el nombre de alguien para ver cuántas veces está en la lista: \n");
		String busqueda= sc.nextLine();
		for (int i=0; i<nombres.length ;i++) {
			if (busqueda.equalsIgnoreCase(nombres[i])) cont++;
		}
		if (cont==1){
			System.out.println("\nHay "+cont+" "+busqueda+" en la lista");
			
		}else {
		System.out.println("\nHay "+cont+" "+busqueda+"s en la lista");
		}
	}
}