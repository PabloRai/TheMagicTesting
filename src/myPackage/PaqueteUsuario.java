package myPackage;

public class PaqueteUsuario extends Paquete {
	private int b;
	public PaqueteUsuario(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public void resolver() {
		System.out.println("Resuelvo las cosas del PU");

	}

}
