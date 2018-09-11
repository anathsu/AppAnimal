package negocio;

public class Urso extends Animal {
	private Caracteristica caracteristica;
	
	public void exibir() {
		super.exibir();
		caracteristica.exibir();
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

}
