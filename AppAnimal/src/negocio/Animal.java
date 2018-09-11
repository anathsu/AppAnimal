package negocio;

public abstract class Animal {
	private String nomeAnimal;
	private int idade;
	private String[] dono;
	
	public void exibir() {
		System.out.printf("-> ANIMAL <-\n"
				+ "Nome do Animal: %s\n"
				+ "Idade: %d anos\n\n",
				nomeAnimal,
				idade
				);
		this.exibirDonos();
	}
		
	private void exibirDonos() {
		System.out.printf("-> DONO(S) <-\n");
		
		for (String nome : dono) {
			System.out.printf("%s. \n", nome);		
		}
		System.out.println(" ");
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String[] getDono() {
		return dono;
	}

	public void setDono(String[] dono) {
		this.dono = dono;
	}
}
