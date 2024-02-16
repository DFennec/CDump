package interfaces;

public class GestorPagos {
	public void pagar(double monto, MétodosDePago método) {
		método.procesarPago(monto);
	}
}