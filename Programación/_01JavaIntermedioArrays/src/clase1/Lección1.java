package clase1;

import java.util.Scanner;

public class Lección1 {

	public static void main(String[] args) {
//	int [] edades = {20,18,36,23,30,20};
//	System.out.println("La edad de Andrés es la tercera y es: "+ edades[2]+ " años.");
//	edades[5]=17;
//	System.out.println(edades[5]);
	int[] edades2=new int[6];
	Scanner sc = new Scanner(System.in);
	int años=0;
//	edades2[0]=18;
//	edades2[1]=19;
//	edades2[2]=11;
//	edades2[3]=10;
//	edades2[4]=15;
//	edades2[5]=17;
	for(int i = 0;i<edades2.length; i++){
		System.out.println("Introduce la edad "+ i +" :");
		años=sc.nextInt();
		edades2[i]=años;
	}
	for(int i = 0;i<edades2.length ; i++){
		System.out.println("La edad en la posición "+ i +" es: "+edades2[i]);
	}
	System.out.println("Mi array edades2 puede almacenar hasta "+edades2.length+" edades.");
	}

}//cierre public class