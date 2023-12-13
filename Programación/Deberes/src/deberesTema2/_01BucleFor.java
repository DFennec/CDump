package deberesTema2;
import java.util.Scanner;
public class _01BucleFor {

	public static void main(String[] args) {
	Scanner inpt= new Scanner(System.in);
	int tablamulti= 0;
	System.out.println("Introduce el número del que quieres extraer su tabla de multiplicar: ");
	int n= inpt.nextInt();
	for(int i=1;i<=10;i++) {
		tablamulti=i*n;
		System.out.println(i+"*"+n+"="+tablamulti);
	}
	}//cierre

}
