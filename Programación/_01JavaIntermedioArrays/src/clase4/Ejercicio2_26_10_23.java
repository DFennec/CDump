package clase4;
public class Ejercicio2_26_10_23 {
	public static void main(String[] args) {
		int cont=0;
		String[] frutas= {"Pera","Manzana","Piña","Pera","Piña"};
		for(int i=0;frutas.length>i;i++) {
			for(int j=0;frutas.length>j;j++) {
				if (frutas[i].equalsIgnoreCase(frutas[j])){
				cont++;
				}
				}if (cont==1) {
					System.out.println(frutas[i]+" está presente en tu lista "+cont+" veces.");
				}else if (cont>=2){/* falta esta condición */
					System.out.println(frutas[i]+" está presente en tu lista "+cont+" veces.");
				}
					cont=0;
			}

			}
		}