package negocio;

public class Gato extends Animal {
	private boolean castrado;
	
	public void exibir() {
		super.exibir();
		System.out.printf("-> GATO <-\n"
				+ "Castrado: %s\n\n",
				castrado ? "SIM" : "NÃO"
				);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
}
