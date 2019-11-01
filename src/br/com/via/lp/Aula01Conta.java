package br.com.via.lp;

public class Aula01Conta {
	
	@Override
	public String toString() {
		return "Aula01Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
	}

	String cliente;
	double saldo;
	
	void exibirSaldo() {
		System.out.println(cliente + " Seu saldo é: " + saldo);
	}
	
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Valor sacado é: " + valor);		
	}
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Valor depositado é: " + valor);
	}
	
	void transferir(Aula01Conta conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}
}
