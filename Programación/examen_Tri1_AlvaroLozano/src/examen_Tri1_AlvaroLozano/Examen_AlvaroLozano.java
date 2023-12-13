package examen_Tri1_AlvaroLozano;
import java.util.Scanner;
public class Examen_AlvaroLozano {

	public static void main(String[] args) {
//Parte 1
		String[] nombresGenero= {"Historia","Arte","Drama"};
		boolean validacion=false;
		String AñadeQuita="";
		int cantidadVer=0;
		Scanner sc= new Scanner(System.in);
		Scanner st= new Scanner(System.in);
		
		System.out.println("¿Cuántos autores hay en la biblioteca?");
		int nAutores = sc.nextInt();
		
		int[][] biblioteca=new int[3][nAutores];
		
		for (int i = 0;i<biblioteca.length;i++){
			
			System.out.println("--"+nombresGenero[i]+"--");
			
			for (int j = 0;j<biblioteca[i].length;j++) {
				
				System.out.println("¿Cuántos libros del Autor "+(j+1)+" acerca de este género tiene la biblioteca?");
				 biblioteca[i][j]= sc.nextInt();
			}//fj
		}//fi
		for (int i = 0;i<biblioteca.length;i++){
			
			System.out.println("\n--"+nombresGenero[i]+"--");
			
			for (int j = 0;j<biblioteca[i].length;j++) {
				
				System.out.println(" Autor "+(1+j)+": "+biblioteca[i][j]);
				
			}//fi
		}//fj
//Parte 2
		while(validacion==false) {
		System.out.println("\nElige un género: \n1. Historia\n2. Arte\n3. Drama");
		int nGen= (sc.nextInt()-1);
		if (nGen>2) {
			System.out.println("\nError: género inválido");
			System.out.println("Finalizando programa");
			validacion=true;
		}//ifGen
		System.out.println("\nElige un número de autor de 1 a "+biblioteca[nGen].length+":");
		nAutores = (sc.nextInt()-1);
		if (nAutores>biblioteca[nGen].length-1) {
			System.out.println("\nError: número de autor inválido");
			System.out.println("Finalizando programa");
			validacion=true;
			break;
		}//ifAut
		else if (nAutores<0){
			System.out.println("\nError: número de autor inválido");
			System.out.println("Finalizando programa");
			validacion=true;
			break;
		}
		System.out.println("\n¿Quieres QUITAR o AÑADIR libros al Autor "+(nAutores+1)+" en "+nombresGenero[nGen]+"?");
		System.out.println("\nEscribe quitar o añadir: ");
		AñadeQuita=st.nextLine();
		if(!(AñadeQuita.equalsIgnoreCase("AÑADIR")||AñadeQuita.equalsIgnoreCase("QUITAR"))) {
			System.out.println("\nError: opción inválida");
			System.out.println("Finalizando programa");
			validacion=true;
			break;
		}else if (AñadeQuita.equalsIgnoreCase("AÑADIR")){
			System.out.println("\nIndica cuántos libros quieres añadir: ");
			cantidadVer=sc.nextInt();
			if (cantidadVer<0) {
				System.out.println("Error: no puedes quitarle libros al autor mientras añades");
				System.out.println("Finalizando programa");
				validacion=true;
				break;
			}
			cantidadVer=biblioteca[nGen][nAutores]+cantidadVer;
			biblioteca[nGen][nAutores]=cantidadVer;
			for (int i = 0;i<biblioteca.length;i++){
				
				System.out.println("\n--"+nombresGenero[i]+"--");
				
				for (int j = 0;j<biblioteca[i].length;j++) {
					
					System.out.println(" Autor "+(1+j)+": "+biblioteca[i][j]);
					
				}//fi
			}//fj
			validacion=true;
		}else {
			System.out.println("Indica cuántos libros quieres quitar: ");
			cantidadVer=sc.nextInt();
			if (cantidadVer<0) {
				System.out.println("Error: no está permitido usar el símbolo negativo");
				System.out.println("Finalizando programa");
				validacion=true;
				break;
			}else if (biblioteca[nGen][nAutores]<cantidadVer){
				System.out.println("Error: no puedes restarle al autor más libros de los que hay");
				System.out.println("Finalizando programa");
				validacion=true;
				break;
			}
			cantidadVer=biblioteca[nGen][nAutores]-cantidadVer;
			biblioteca[nGen][nAutores]=cantidadVer;
			for (int i = 0;i<biblioteca.length;i++){
				
				System.out.println("\n--"+nombresGenero[i]+"--");
				
				for (int j = 0;j<biblioteca[i].length;j++) {
					
					System.out.println(" Autor "+(1+j)+": "+biblioteca[i][j]);
					
				}//fi
			}//fj
			validacion=true;
		}
		}//wValid
		sc.close();
	}//main
}//class