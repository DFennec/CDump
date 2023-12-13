package deberesTema2;
import java.util.Scanner;

public class _005SistemaDeDescuentos {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	Scanner ln= new Scanner (System.in);
	String tipocliente="";
	double precio=0;
	double preciofin=0;
	System.out.println("¿Cuánto cuesta el producto?");
	precio=sc.nextDouble();
	System.out.println("¿Qué tipo de cliente es usted?");
	tipocliente=ln.nextLine();
	tipocliente=tipocliente.toLowerCase();
	if (tipocliente.equals("estandar")) {
		tipocliente="estándar";
	}
	switch(tipocliente) {
	case "nuevo": preciofin=precio*1;
	break;
	case "estándar": preciofin=precio*0.9;
	break;
	case "vip": preciofin=precio*0.75;
	break;
	}
	System.out.println("El precio final es: "+preciofin);
	sc.close();
	}

}
