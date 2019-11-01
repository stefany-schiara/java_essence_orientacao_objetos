package br.com.via.lp;

public class Aula06UsaConstrutores {

	public static void main(String[] args) {
		
		Aula06Construtores construtorVazio = new Aula06Construtores();
		construtorVazio.setNome("Schiara");
		construtorVazio.setIdade(29);
		construtorVazio.setEndereco("Minha casa");
		
		System.out.println(construtorVazio.getNome()	+ "\n" + 
						   construtorVazio.getIdade()	+ "\n" + 
						   construtorVazio.getEndereco());
		
		Aula06Construtores construtorCheio = new Aula06Construtores("Stefany", 29, "Minha casa");
		System.out.println(construtorCheio.getNome() 	+ "\n" + 
				   construtorCheio.getIdade() 			+ "\n" + 
				   construtorCheio.getEndereco());
	}

}
