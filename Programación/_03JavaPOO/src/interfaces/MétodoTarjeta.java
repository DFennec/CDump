package interfaces;

public class MétodoTarjeta implements MétodosDePago{
	private int cvc;
	private String titular;
	private int numero;
	public MétodoTarjeta(int cvc, String titular, int numero) {
		super();
		this.cvc = cvc;
		this.titular = titular;
		this.numero = numero;
	}
	public void procesarPago(double monto) {
		System.out.println("Has pagado "+ monto +" € con tarjeta.");
	}
	
}