package teste;

import negocio.Cachorro;
import negocio.Caracteristica;
import negocio.Gato;
import negocio.Urso;

public class TestaAnimal {
	public static void main(String[] args) {
		String[] donosGato = {"Tom", "Jerry"};
		
		Caracteristica caracUrso = new Caracteristica();
		caracUrso.setPeso(100);
		caracUrso.setAltura(2.3);
		caracUrso.setCor("Branco");
		
		String[] donoUrso = {"Marsha"};
		Urso urso = new Urso();
		urso.setNomeAnimal("Tobe");
		urso.setIdade(8);
		urso.setDono(donoUrso);
		urso.setCaracteristica(caracUrso);
//		urso.exibir();
		
		Gato gato = new Gato();
		gato.setIdade(5);
		gato.setNomeAnimal("Gargamel");
		gato.setDono(donosGato);
		gato.setCastrado(true);
//		gato.exibir();
		
		Caracteristica caracOlga = new Caracteristica();
		caracOlga.setAltura(0.15);
		caracOlga.setPeso(15);
		caracOlga.setCor("Marrom");

		String[] donosOlga = {"João", "Maria"};
		Cachorro cao1 = new Cachorro();
		cao1.setNomeAnimal("Olga");
		cao1.setIdade(10);
		cao1.setDono(donosOlga);
		cao1.setRaca("PUG");
		cao1.setCaracteristica(caracOlga);
//		cao1.exibir();
		
		Caracteristica caracRonda = new Caracteristica();
		caracRonda.setAltura(0.50);
		caracRonda.setPeso(40);
		caracRonda.setCor("PRETO");
		
		String[] donosRonda = {"Hugo", "José", "Luís"};
		Cachorro cao2 = new Cachorro();
		cao2.setNomeAnimal("Ronda");
		cao2.setIdade(2);
		cao2.setRaca("Rottweiler");
		cao2.setCaracteristica(caracRonda);
		cao2.setDono(donosRonda);
		cao2.exibir();
			
	}
}
