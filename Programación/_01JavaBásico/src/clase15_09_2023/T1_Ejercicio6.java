package clase15_09_2023;

public class T1_Ejercicio6 {

	public static void main(String[] args) {
	int edad=11;
	if(edad<=12){
		System.out.println("Con "+edad+" eres Niño");
	}else if(edad<18){
		System.out.println("Con "+edad+" eres Adolescente");
	}else if(edad>=18 && edad<60){
		System.out.println("Con "+edad+" eres Adulto");
	}else{
		System.out.println("Con "+edad+" eres Anciano");		
	}
	}
}
