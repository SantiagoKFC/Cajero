package Cajero;

public  class Aplicacion extends Cuenta {
	protected String numberApp;
	protected int claveAPP;
	protected double cashAPP;
	public String getNumberApp() {
		return numberApp;
	}
	public void setNumberApp(String numberApp) {
		this.numberApp = numberApp;
	}
	public int getClaveAPP() {
		return claveAPP;
	}
	public void setClaveAPP(int claveAPP) {
		this.claveAPP = claveAPP;
	}
	public double getCashAPP() {
		return cashAPP;
	}
	public void setCashAPP(double cashAPP) {
		this.cashAPP = cashAPP;
	}
	
	
}
