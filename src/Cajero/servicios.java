package Cajero;

public class servicios extends Aplicacion {
public servicios(double pago) {
		super();
		this.pago = pago;
	}

protected double pago;

public double getPago() {
	return pago;
}

public void setPago(double pago) {
	this.pago = pago;
}


}
