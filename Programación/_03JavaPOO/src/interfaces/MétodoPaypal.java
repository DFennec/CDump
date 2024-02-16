package interfaces;

public class MétodoPaypal implements MétodosDePago{
	private String email;
	private String contraseña;
	public MétodoPaypal(String email, String contraseña) {
		super();
		this.email = email;
		this.contraseña = contraseña;
	}
	public void procesarPago(double monto) {
		System.out.println("Has pagado "+ monto +" € con PayPal.");
	}
}