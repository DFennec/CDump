package lección3;
import java.util.Scanner;
public class Ej19_09_2SumaTotalWhile {

	public static void main(String[] args) {
	System.out.println("Introduzca números para sumarlos al total. Cuando no desee añadir más, introduzca 0: ");
	int sum=0;
	Scanner inpt= new Scanner(System.in);
	int input= inpt.nextInt();
	while(input!=0){
		System.out.println(sum+"+"+input+"=");
		sum+=input;
		System.out.println(sum+"\n");
		input= inpt.nextInt();
	}
	}
}