package lección3;
import java.util.Scanner;
public class EJ19_09_1ForAN {

	public static void main(String[] args) {
	Scanner inpt= new Scanner(System.in);
	System.out.println("Introduce el número hasta el que quieres que se sume a sí mismo: ");
	int n=inpt.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum+=i;
		System.out.println(sum);
	}
	}

}
