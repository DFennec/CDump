package deberesTema2;
import java.util.Scanner;
public class _03BucleNumPrim {

	public static void main(String[] args) {
	Scanner inpt= new Scanner(System.in);
	double num= inpt.nextDouble();
	double cnum=0;
	System.out.println("\nLos números primos de"+num+" son:");
	do{
		cnum++;
	}while(cnum!=num);
	}

}