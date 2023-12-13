import java.util.Scanner;
public class BriefMathMethods {

	public static void main(String[] args) {
	double x=3.14;
	double y=-10;
	
	double z=Math.max(y,x);// Compara dos valores y se queda con el mayor
	System.out.println(z);
	double w=Math.min(y,x);// Compara dos valores y se queda con el menor
	System.out.println(w);
	double yabs=Math.abs(y);//Valor absoluto de una variable (convierte neg en pos)
	System.out.println(yabs);
	double xsqrR=Math.sqrt(3.14);//Raiz cuadrada
	System.out.println(xsqrR);
	double xR=Math.round(x);//Redondeo
	System.out.println(xR);
	double xC=Math.ceil(x);//Redondeo siempre hacia arriba
	System.out.println(xC);//Si tiene un decimal siempre te redondea al entero superior
	//En este caso 3.1 pasa a ser 4 en vez de 3.
	double xF=Math.floor(x);//Redondeo siempre hacia abajo (truncar)
	System.out.println(xF);//Igual que ceil pero al revés, no importa el decimal,
	//siempre va hacia el entero inferior.
	
	//Sacar hipotenusa
	double a;
	double b;
	double c;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("\nLado a: ");
	a= sc.nextDouble();
	System.out.println("Lado b: ");
	b= sc.nextDouble();
	c=Math.sqrt(a*a+b*b);
	System.out.println("Lado c = "+ c);
	sc.close();
	}

}
