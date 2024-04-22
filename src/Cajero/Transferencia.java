package Cajero;

public class Transferencia extends Aplicacion{

	protected double monto;
	protected long cuentaE;
	protected byte transfer;
	protected byte transferApp;
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public long getCuentaE() {
		return cuentaE;
	}
	public void setCuentaE(long cuentaE) {
		this.cuentaE = cuentaE;
	}
	public byte getTransfer() {
		return transfer;
	}
	public void setTransfer(byte transfer) {
		this.transfer = transfer;
	}
	public byte getTransferApp() {
		return transferApp;
	}
	public void setTransferApp(byte transferApp) {
		this.transferApp = transferApp;
	}
	public Transferencia(double monto, long cuentaE, byte transfer, byte transferApp) {
		super();
		this.monto = monto;
		this.cuentaE = cuentaE;
		this.transfer = transfer;
		this.transferApp = transferApp;
	}
	
}
