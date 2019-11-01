package br.com.via.lp;

public abstract class Aula07HerancaPessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public abstract void mostrarDados();
	
	public Aula07HerancaPessoa() {
	}
	
	public Aula07HerancaPessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
