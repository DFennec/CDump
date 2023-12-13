package clase4;

public class Ejercicio3_26_10_23 {

	public static void main(String[] args) {
		String[] frutas= {"Pera","Manzana","Piña","Pera","Piña"};
		for(int i=0;frutas.length>i;i++) {
			for(int j=i+1;frutas.length>j;j++) {
				if((frutas[i]!=(null))){
				if (frutas[i].equalsIgnoreCase(frutas[j])){
					frutas[i]=null;
				}
				}
				}
			if (frutas[i]!=null && (i+1!=frutas.length)) {
				System.out.print(frutas[i]+", ");
				}else if (frutas[i]!=null){
					System.out.println(frutas[i]);
				}
		}
		}
	}