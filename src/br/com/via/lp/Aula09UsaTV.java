package br.com.via.lp;

public class Aula09UsaTV {
	

	public static void main(String[] args) {
	
	Aula09InterfaceTvTubo tubo = new Aula09InterfaceTvTubo(42);
	
	tubo.ligar();
	tubo.mudarCanal(4);
	tubo.aumentarVolume(10);

	}

}
