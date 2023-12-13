package clase8_Arrays2D;

public class Arrays2D_2ªLección {

	public static void main(String[] args) {
		String[][] Asientos=new String [10][];
		boolean check=false;
		for(int i=0;i<Asientos.length ;i++) {
			System.out.print("Fila "+(i+1)+":");;
				Asientos[i]= new String [i+2];

			for(int j=0;j<Asientos[i].length;j++) {
				Asientos[i][j]=" |Libre|";
				System.out.print(Asientos[i][j]);
			}
			System.out.println();
		}
	
	}//main
}//class