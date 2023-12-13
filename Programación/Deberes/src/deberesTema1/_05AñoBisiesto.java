package deberesTema1;

public class _05AñoBisiesto {

	public static void main(String[] args) {
	int año=2020;
	int bisiesto=año%4;
	if (bisiesto==0) {
		System.out.println(año+" es año bisiesto.");
	}else{
		System.out.println(año+" no es año bisiesto.");
	}
	}

}
