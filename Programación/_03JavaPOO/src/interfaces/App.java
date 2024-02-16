package interfaces;

public class App{
	public static void main(String[] args) {
		
	
	MétodoTarjeta tj1= new MétodoTarjeta(221,"Elpepe",747391);
	MétodoPaypal pp1= new MétodoPaypal("elpepe@gmail.com","Elpepe");
	GestorPagos gestor=new GestorPagos();
	gestor.pagar(10.2,tj1);
	gestor.pagar(100.23,pp1);
	
	}
}