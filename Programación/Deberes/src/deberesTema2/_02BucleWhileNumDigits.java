package deberesTema2;
import java.util.Scanner;
public class _02BucleWhileNumDigits {

	public static void main(String[] args) {
	Scanner inpt = new Scanner (System.in);
	System.out.println("Introduce un número para contar sus dígitos: ");
	int num=inpt.nextInt();
	int lon=0;
	while (num>=1){
		num/=10;
		lon++;
	}
	System.out.println(lon);
	}//end

}