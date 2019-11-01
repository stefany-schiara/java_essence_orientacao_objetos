package br.com.via.lp;

public class Aula08UsaPolimorfismo {

	public void fazerAnimalComer(Aula08PolimorfismoAnimal animal) {
		
		animal.comer();
	}
	
	public static void main(String[] args) {
		Aula08UsaPolimorfismo teste = new Aula08UsaPolimorfismo();
		
		teste.fazerAnimalComer(new Aula08PolimorfismoAnimal());
		teste.fazerAnimalComer(new Aula08PolimorfismoTigre());
		teste.fazerAnimalComer(new Aula08PolimorfismoCao());
		
		Aula08PolimorfismoAnimal animal = new Aula08PolimorfismoTigre();
		animal.comer();
		
		
		Aula08PolimorfismoAnimal cao = new Aula08PolimorfismoCao();
		cao.comer();
	}

}
