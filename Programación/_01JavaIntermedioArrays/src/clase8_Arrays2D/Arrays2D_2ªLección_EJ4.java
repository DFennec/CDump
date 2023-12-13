package clase8_Arrays2D;

public class Arrays2D_2ªLección_EJ4 {

	public static void main(String[] args) {
		double[][]calificaciones=new double[5][2];
		for(int i=0;i<calificaciones.length;i++) {
			System.out.print("Estudiante "+(i+1)+": ");
			for(int j=0;j<calificaciones[i].length;j++) {
				calificaciones[i][j]=(Math.random()*10);
				System.out.printf("%.2f"+" | ",calificaciones[i][j]);
			}
			System.out.println();
		}
	}

}
