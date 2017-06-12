package myPackage;

public class Main {

	public static void main(String[] args) {
		Paquete p = new PaqueteUsuario(2,3);
		p.resolver();
		Paquete p2 = new PaquetePersonaje(7,2);
		p2.resolver();

	}

}
