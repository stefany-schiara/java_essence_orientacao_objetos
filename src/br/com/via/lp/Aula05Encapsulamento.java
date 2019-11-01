package br.com.via.lp;

public class Aula05Encapsulamento {

	private String tipoMaterial;
	private int capacidade;
	
	public void mostrarConteudo() {
		System.out.println("Material: " + getTipoMaterial() + "\n" + 
						   "Capacidade: " + getCapacidade());
	}
	
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
