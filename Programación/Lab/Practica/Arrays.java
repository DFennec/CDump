
public class Arrays {

	public static void main(String[] args) {
	String[] cars = {"Seat","Opel","Toyota"};//Crear un array con contenidos
	System.out.println(cars[0]);
	cars[0] = "Mustang";
	System.out.println(cars[0]);
	String[] bikes = new String [3];//Crear un array vacío que espera tener 4
	//valores y que se añadirán más tarde
	bikes[0]="Yamaha";
	bikes[1]="Kawasaki";
	bikes[2]="Honda";
	//usar un bucle para iterar a través de todos los valores del array
	for(int i=0;i<cars.length;i++){
		System.out.println("\n"+bikes[i]);
	}
	}

}
