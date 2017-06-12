package myPackage;

public class PaquetePersonaje extends Paquete {
	private int c;
	public PaquetePersonaje(int a, int c) {
		super(a);
		this.c = c;
	}
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public void resolver() {
		System.out.println("Resuelvo las cosas de PP");

	}

}
