package clase5;
import java.util.Scanner;
public class Ejercicio4_27_10_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Scanner eleg = new Scanner (System.in);
		int entrada=0;
		int cantidadasientos=0;
		boolean met =false;
		String asientoeleg;
		String[] asientos= {"1A","1B","1C","1D","2A","2B","2C","2D","3A","3B","3C","3D"};
		String[] asientoslimp= {"1A","1B","1C","1D","2A","2B","2C","2D","3A","3B","3C","3D"};
		while (entrada!=4) {
			System.out.println("\n\n1.Reservar asiento \n2.Cancelar reserva \n3.Ver asientos \n4.Salir \n\nIngrese un número:");
			entrada=sc.nextInt();
		if (entrada==1) {
				System.out.println("\n¿Cuántos asientos desea reservar?");
				cantidadasientos=sc.nextInt();
			if(cantidadasientos<asientos.length){
				if (cantidadasientos>0){
				System.out.println("\n¿Qué asientos desea reservar? Por favor, introdúzcalos uno por uno:");
				}
				for(int i = 0;cantidadasientos>i;i++){
					asientoeleg=eleg.nextLine();
					
					for(int j=0;asientos.length>j;j++) {
						
						if(asientoeleg.equalsIgnoreCase(asientos[j])) {
						System.out.println("\nAsiento "+asientoeleg+" reservado\n");
						asientos[j]=asientos[j]+"x";
						met=true;
						}else if(met==false&&(j==(asientos.length-1))){
							System.out.println("Asiento no disponible");
							i--;
							}
						}
						met=false;
					}/*for*/
				}else {System.out.println("No disponemos de suficientes asientos");}	
			}/*if*/
			if (entrada==2) {
				System.out.println("¿Cuántos asientos desea cancelar?");
				cantidadasientos=sc.nextInt();
				if(cantidadasientos<asientos.length){
				if (cantidadasientos>0){
				System.out.println("¿Qué asientos desea cancelar?");
				}
				for(int i = 0;cantidadasientos>i;i++){
					asientoeleg=eleg.nextLine();
					
						for(int j=0;asientos.length>j;j++) {
						
							if(!(asientoeleg.equalsIgnoreCase(asientos[j]))&&(asientoeleg.equalsIgnoreCase(asientoslimp[j]))) {
								System.out.println("\nAsiento "+asientoeleg+" despejado\n");
								asientos[j]=asientoslimp[j];
								met=true;
								j=asientos.length;
						
							}else if(met==false&&(j==(asientos.length-1))){
								System.out.println("Este asiento no estaba reservado o no existe");
								i--;
							}
						}
						met=false;
					}/*for*/
				}else {System.out.println("No disponemos de suficientes asientos");}
			}/*if*/
			
			if (entrada==3) {
				System.out.println("Estos son los asientos de los que disponemos:");
				
				for(int i = 0; asientos.length>i;i++){
					System.out.print("|"+asientos[i]+"|");
				}/*for*/
			}/*if*/
		}/*while*/
	}/*static void*/
}/*public class*/
