package br.com.via.lp;

public class Aula07HerancaFuncionario extends Aula07HerancaPessoaFisica {
	
	private String matricula;

	public Aula07HerancaFuncionario() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println(getNome() + "\n" 
						+ getEndereco() + "\n"
						+ getTelefone() + "\n"
						+ getCpf() + "\n"
						+ getMatricula()) ;		
	}
	
}
