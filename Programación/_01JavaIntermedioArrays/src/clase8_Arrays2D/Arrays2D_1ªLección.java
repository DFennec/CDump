package clase8_Arrays2D;

public class Arrays2D_1ªLección {

	public static void main(String[] args) {
		int[][] tablaMultiplicar = new int [2][2];
		for(int i = 0;i<tablaMultiplicar.length;i++) {
			for(int j=0;j<tablaMultiplicar[i].length;j++) {
				tablaMultiplicar[i][j]=(j+1)*(i+1);
				System.out.print(" "+tablaMultiplicar[i][j]+" |");
			}
			System.out.println("\n");
		}
	}//main
}//class