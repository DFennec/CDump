package clase5;

public class Ejercicio1_27_10_23 {

	public static void main(String[] args) {
		String[] Frase1 = {"El","Tiempo","Es","Dinero","Dinero"};
		String[] Frase2 = {"No","Es","Dinero","Pierdas","El","Tiempo"};
		int contarr=0;
		int cIdx=0;
		if (Frase1.length>Frase2.length) {
		for(int i=0; i<Frase1.length;i++) {
			for(int j =0;j<Frase2.length;j++){
				if(Frase1[i].equalsIgnoreCase(Frase2[j])){
					contarr++;
				}
			}
		}String[] Comunes = new String[contarr];
		for(int i=0; i<Frase1.length;i++) {
			for(int j =0;j<Frase2.length;j++){
				if(Frase1[i].equalsIgnoreCase(Frase2[j])){
					Comunes[cIdx]=Frase1[i];
					System.out.print(Comunes[cIdx]+" | ");
					cIdx++;
				}
			}
		}
			}else {
				for(int i=0; i<Frase2.length;i++) {
					for(int j =0;j<Frase1.length;j++){
						if(Frase2[i].equalsIgnoreCase(Frase1[j])){
							contarr++;
						}
					}
				}String[] Comunes = new String[contarr];
				for(int i=0; i<Frase2.length;i++) {
					for(int j =0;j<Frase1.length;j++){
						if(Frase2[i].equalsIgnoreCase(Frase1[j])){
							Comunes[cIdx]=Frase2[i];
							System.out.print(Comunes[cIdx]+" | ");
							cIdx++;
						}
					}
				}
				
		}
	}

}
