package deberesTema2;
import java.util.Scanner;
public class _DefinirConstantesConFinal {

	public static void main(String[] args) {
	double iva=1.21;
	System.out.println("Introduce el importe para calcular su precio final: ");
	Scanner imp= new Scanner(System.in);
	double importe=imp.nextDouble();
	final double precio= iva*importe;
	System.out.println(precio);
	}
}