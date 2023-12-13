package clase5;

public class Ejercicio2_27_10_23 {

	public static void main(String[] args) {
		String[] Frase1 = {"El","Tiempo","Es","Dinero","Dinero"};
		String[] Frase2 = {"No","Es","Dinero","Pierdas","El","Tiempo"};
		int contadorEspaciosArray=0;
		int contadorIndice=0;
		if (Frase1.length>Frase2.length) {
			System.out.println("Frase1");
		for(int i=0; i<Frase1.length;i++) {
			for(int j =0;j<Frase2.length;j++){
				
				if(Frase1[i].equalsIgnoreCase(Frase2[j])){
					contadorEspaciosArray++;
				}
			}
		}String[] Comunes = new String[contadorEspaciosArray];
		for(int i=0; i<Frase1.length;i++) {
			for(int j =0;j<Frase2.length;j++){
				if(Frase1[i].equalsIgnoreCase(Frase2[j])){
					Comunes[contadorIndice]=Frase1[i];
					System.out.print(Comunes[contadorIndice]+" | ");
					contadorIndice++;
				}
			}
		}
			}else {
				System.out.println("Frase2");
				for(int i=0; i<Frase2.length;i++) {
					for(int j =0;j<Frase1.length;j++){
						if(Frase2[i].equalsIgnoreCase(Frase1[j])){
							contadorEspaciosArray++;
						}
					}
				}String[] Comunes = new String[contadorEspaciosArray];
				for(int i=0; i<Frase2.length;i++) {
					for(int j =0;j<Frase1.length;j++){
						if(Frase2[i].equalsIgnoreCase(Frase1[j])){
							Comunes[contadorIndice]=Frase2[i];
							System.out.print(Comunes[contadorIndice]+" | ");
							contadorIndice++;
						}
					}
				}
				
		}
	}

}
