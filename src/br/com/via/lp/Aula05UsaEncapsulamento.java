package br.com.via.lp;

public class Aula05UsaEncapsulamento {

	public static void main(String[] args) {
		Aula05Encapsulamento garrafa = new Aula05Encapsulamento();
		
		garrafa.setCapacidade(1000);
		garrafa.setTipoMaterial("Vidro");
		garrafa.mostrarConteudo();

	}

}
