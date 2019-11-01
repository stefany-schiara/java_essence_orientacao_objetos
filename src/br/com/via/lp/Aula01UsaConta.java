package br.com.via.lp;

public class Aula01UsaConta {

	public static void main(String[] args) {
		
		Aula01Conta contaProf = new Aula01Conta();
		Aula01Conta contaVia = new Aula01Conta();
		
		contaProf.cliente = "Stefany Schiara";
		contaProf.saldo = 100.00;
		
		contaProf.exibirSaldo();
		
		contaVia.cliente = "Via Varejo";
		contaVia.saldo = 10000.00;
		contaVia.exibirSaldo();
		
		contaProf.sacar(50.00);		
		contaProf.exibirSaldo();
		contaProf.depositar(100);
		contaProf.exibirSaldo();
		
		contaVia.transferir(contaProf, 1000);
		contaProf.exibirSaldo();
		
		System.out.println(contaProf);
		
	}

}
