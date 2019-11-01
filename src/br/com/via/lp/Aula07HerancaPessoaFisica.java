package br.com.via.lp;

public class Aula07HerancaPessoaFisica extends Aula07HerancaPessoa {
	
	private String cpf;

	public Aula07HerancaPessoaFisica() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNome() + "\n" 
						+ getEndereco() + "\n"
						+ getTelefone() + "\n"
						+ getCpf()) ;		
	}

}
