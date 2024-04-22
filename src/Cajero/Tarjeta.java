package Cajero;

public class Tarjeta extends Cuenta {

	protected int tarjetaN;

	public Tarjeta(int tarjetaN) {
		super();
		this.tarjetaN = tarjetaN;
	}

	public int getTarjetaN() {
		return tarjetaN;
	}

	public void setTarjetaN(int tarjetaN) {
		this.tarjetaN = tarjetaN;
	}
public double retirar(double monto) {
	double total=0;
	if(monto<=cash) {
		System.out.println("Retiro permitido");
		System.out.println("Tiene cinco segundos para retirar su dinero");
		System.out.println(" ----\n"
				+ "|   $   |\n"
				+ "----\n");
		total=cash-monto;
		System.out.println("Dinero en la cuenta"+total);
		return total;
	}else {
		System.out.println("Monto superior a dinero permitido, retiro denegado");
		System.out.println("Dinero en la cuenta"+cash);
		return total;
	}

}
}
