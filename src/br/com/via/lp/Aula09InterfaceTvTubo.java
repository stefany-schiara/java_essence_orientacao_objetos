package br.com.via.lp;

public class Aula09InterfaceTvTubo extends Aula09InterfaceTV implements Aula09InterfaceControle {

	public Aula09InterfaceTvTubo(int tamanho) {
		super(tamanho);
	}

	@Override
	public void mudarCanal(int canal) {
		System.out.println("Alterado para canal" + canal);
		
	}

	@Override
	public void aumentarVolume(int taxa) {
		System.out.println("Taxa volume" + taxa);
		
	}

	@Override
	public void diminuirVolume(int taxa) {
		System.out.println("Tava volume" + taxa);
		
	}

	@Override
	public boolean ligar() {
		System.out.println("A Tv está ligada");
		return false;
	}

	@Override
	public boolean desligar() {
		System.out.println("A Tv está desligada");
		return false;
	} 
	
	

}
