package br.com.via.generics;

public class Cartas {
	
	public Cartas(Naipe naipe, Valor valor) {
		super();
		this.naipe = naipe;
		this.valor = valor;
	}
	
	public enum Naipe {
		PICAFUMO, ESPADILHA, SETECOPA, ZAP
	}
	
	public enum Valor {
		AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REI
	}
	
	private Naipe naipe;
	private Valor valor;

	@Override
	public String toString() {
		return valor + " de " + naipe;
	}
	
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	
	
}
