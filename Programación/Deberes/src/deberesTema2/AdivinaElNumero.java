package deberesTema2;
import java.util.Random;
import java.util.Scanner;
public class AdivinaElNumero {

	public static void main(String[] args) {
	int i;
	Random rand= new Random();
	int NumAdivinar=rand.nextInt(100)+1;
	System.out.println(NumAdivinar);
	Scanner sc= new Scanner(System.in);
	System.out.println("Trata de adivinar el número: ");
	int Respuesta=sc.nextInt();
	boolean adivinar=Respuesta!=NumAdivinar;
	for(i=9;i!=0;i--) {
		if(!adivinar){
			System.out.println("¡Respuesta correcta!");
			break;
		}
		System.out.println("Respuesta incorrecta. Te quedan "+i+" intentos.\nTrata de adivinar el número: ");
		Respuesta=sc.nextInt();
	}
	}

}
