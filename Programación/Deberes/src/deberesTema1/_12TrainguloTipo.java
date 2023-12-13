package deberesTema1;

public class _12TrainguloTipo {
	public static void main(String[] args) {
	int lado1=5;
	int lado2=4;
	int lado3=3;
	if ((lado1==lado2||lado1==lado3||lado2==lado3)&&(lado1!=lado2||lado1!=lado3||lado2!=lado3)){
		System.out.println("Este triángulo es isósceles.");
	}else if(lado1==lado2 && lado2==lado3){
		System.out.println("Este triángulo es equilátero.");
	}else{
		System.out.println("Este triángulo es escaleno.");
		}
	}
}