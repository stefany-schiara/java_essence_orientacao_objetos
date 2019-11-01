package br.com.via.lp;

public class Aula02UsaCachorro {
	
	public static void main(String[] args) {
		//instanciar dois objetos e popular eles
		
		Aula02Cachorro bulldog = new Aula02Cachorro();
		bulldog.raca = "Bulldog";
		bulldog.sexo = "Macho";
		bulldog.tamanho = 3;
		
		bulldog.latir();
		
		Aula02Cachorro pitbull = new Aula02Cachorro();
		pitbull.raca = "PitBull";
		pitbull.sexo = "Femea";
		pitbull.tamanho = 4;
		
		pitbull.latir(); 		
		
			
	}
}
