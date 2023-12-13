package clase15_09_2023;
import java.util.Scanner;
public class T2_Ejercicio4 {

	public static void main(String[] args) {
	int consulta=0;
	Scanner cons = new Scanner (System.in);
	System.out.println("Introduzca un número: ");
	consulta= cons.nextInt();
	if(consulta%2==0 && consulta!=0){
		System.out.println("Par.");
	}else if(consulta%2==1){
		System.out.println("Impar.");
	}else {
		System.out.println("Has introducido 0");
	}
	}
	}
