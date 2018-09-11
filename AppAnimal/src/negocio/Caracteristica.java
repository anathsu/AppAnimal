package negocio;

public class Caracteristica {
	private float peso;
	private double altura;
	private String cor;
	
	public void exibir() {
		System.out.printf("-> CARACTERISTICA <-\n"
				+ "Peso: %.1fkg\n"
				+ "Altura: %.2fm\n"
				+ "Cor: %s\n\n",
				peso,
				altura,
				cor
				);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
