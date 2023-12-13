import java.util.Random;
public class RandomNumbs {

	public static void main(String[] args) {
	Random rand = new Random();
	int x = rand.nextInt();
	System.out.println(x);
	// el numero aleatorio de esta funcion es demasiado grande por el rango que
	//emplea, por ello es necesario limitarlo para que de numeros útiles para
	//el propósito del programa en cuestión.
	int y = rand.nextInt(6)+1;//Limitamos la aleatoriedad de 1 a 6 para que no salga
	//0 al tirar un hipotetico dado y que no se quede en 5 cuando debería ser 6
	//sumando 1 al resultado.
	System.out.println(y);
	boolean z=rand.nextBoolean();//Booleano aleatorio, es decir, el programa
	//hará 50% entre sí y no.
	System.out.println(z);
	}

}