package myPackage;

public abstract class Paquete implements IMensaje{
	private int a;
	public Paquete(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}
