package deberesTema2;
import java.util.Scanner;
public class _05SwitchPedir2Num {

	public static void main(String[] args) {
	String respuesta="";
	int num1=0;
	int num2=0;
	int res=0;
	double resdiv=0;
	Scanner n1= new Scanner(System.in);
	Scanner n2= new Scanner(System.in);
	Scanner rp= new Scanner(System.in);
	System.out.println("Introduce el primer digito: ");
	num1=n1.nextInt();
	System.out.println("Introduce la operación: "+ num1);
	respuesta=rp.nextLine();
	System.out.println("Introduce el segundo digito: "+ num1 + respuesta);
	num2=n2.nextInt();
	switch(respuesta) {
	case "+":
		res=num1+num2;
		System.out.println(res);
		break;
	case "-":
		res=num1-num2;
		System.out.println(res);
		break;
	case "/":
		resdiv=num1/num2;
		System.out.println(resdiv);
		break;
	case "*":
		res=num1*num2;
		System.out.println(res);
		break;
	default:
		System.out.println("Error: Utilice +, -, * o / para ejecutar una operación");
		break;
	}
}
}