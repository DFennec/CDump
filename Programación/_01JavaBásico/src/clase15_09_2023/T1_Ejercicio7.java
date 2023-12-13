package clase15_09_2023;

public class T1_Ejercicio7 {

	public static void main(String[] args) {
		int año=2020;
		if (año%4==0 &&(año%100!=0||año%400==0)){
			System.out.println(año+ " es bisiesto");
		}else{
			System.out.println(año+" no es bisiesto");
		}
		}
		}