package clase9_Arrays2D;
import java.util.Scanner;
public class Arrays2D_3ªLección_EJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ntiendas=0;
		int ndepartamentos=0;
		int ncategorias=0;
		while(ntiendas<=0) {
			System.out.println("Ingresa un número de tiendas:");
			ntiendas=sc.nextInt();
			if(ntiendas<=0) {
				System.out.println("Número de tiendas no válido. Por favor, ingresa un número válido mayor o igual a 1.");
			}
		}
		int[][][]inventario= new int [ntiendas][][];
		for(int i=0;i<inventario.length;i++) {
			System.out.println("\nTienda número "+(i+1)+":");
			while(ndepartamentos<=0) {
				System.out.println("Ingresa un número de departamentos por tienda:");
				ndepartamentos=sc.nextInt();
				if(ndepartamentos<=0) {
					System.out.println("Número de departamentos no válido. Por favor, ingresa un número válido mayor o igual a 1.");
				}else {
					inventario [i]=new int [ndepartamentos][];
				}
			}
			ndepartamentos=0;
			for(int j=0;j<inventario[i].length;j++) {
				System.out.println("\nDepartamento número "+(j+1)+":");
				while(ncategorias<=0) {
					System.out.println("Ingresa un número de categorías por departamento:");
					ncategorias=sc.nextInt();
					if(ncategorias<=0) {
						System.out.println("Número de categorías no válido. Por favor, ingresa un número válido mayor o igual a 1.");
					}else {
						inventario[i][j]=new int[ncategorias];
					}
			}
				ncategorias=0;
			for(int k=0;k<inventario[i][j].length;k++) {
				System.out.println("\nStock de tienda "+(i+1)+", departamento "+(j+1)+", categoría "+(k+1)+":");
				inventario[i][j][k]=sc.nextInt();
			}
		}
		}
		sc.close();
		for(int i=0;i<inventario.length;i++) {
			System.out.println("--------------------");
			System.out.println("Tienda "+(i+1));
			for(int j=0;j<inventario[i].length;j++) {
				System.out.println("  Departamento "+(j+1));
			for(int k=0;k<inventario[i][j].length;k++) {
				System.out.print("    Categoría "+(k+1)+" · stock:"+inventario[i][j][k]);
			}
			System.out.println("");
		}
		}
	}//main
}//class