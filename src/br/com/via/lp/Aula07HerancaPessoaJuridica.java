package br.com.via.lp;

public class Aula07HerancaPessoaJuridica extends Aula07HerancaPessoa {

	private String CNPJ;

	public Aula07HerancaPessoaJuridica() {
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public void mostrarDados() {
		System.out.println(getCNPJ() + "\n"
				+ getEndereco() + "\n"
				+ getNome() + "\n"
				+ getTelefone() + "\n");
		
	}
}
