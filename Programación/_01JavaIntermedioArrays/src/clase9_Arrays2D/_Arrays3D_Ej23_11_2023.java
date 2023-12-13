package clase9_Arrays2D;
import java.util.Scanner;
public class _Arrays3D_Ej23_11_2023 {

	public static void main(String[] args) {
		
		float[][][]temperaturas;
		Scanner sc = new Scanner (System.in);
		float piso= 0;
		float habitacion=0;
		float temperatura=0;
		System.out.println("¿Cuántos pisos tiene su edificio?");
		piso=sc.nextFloat();
		float[][][]temperaturas;
		for (float i[][] : temperaturas) {
			for (float j[] : i){
				
				temperaturas[i][j][3];
				for (float k : j){
					int contador=0;
					System.out.println("Introduce la temperatura del día, la tarde y la noche: ");
					while(contador<3){
						contador++;
						temperaturas[i][j][contador]=sc.nextFloat();
					}
					contador = 0;
				}//fin #3 for
			}//fin #2 for
		}//fin #1 for
	}//main

}
