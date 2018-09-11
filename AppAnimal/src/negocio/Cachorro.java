package negocio;

public class Cachorro extends Animal {
	private String raca;
	private Caracteristica caracteristica;
	
	public void exibir() {
		super.exibir();
		System.out.printf("-> CACHORRO <-\n"
				+ "Raça: %s\n\n",
				raca
				);
		caracteristica.exibir();
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

}
