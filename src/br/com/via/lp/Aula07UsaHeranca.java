package br.com.via.lp;

public class Aula07UsaHeranca {

	public static void main(String[] args) {
		
		Aula07HerancaPessoaFisica pf = new Aula07HerancaPessoaFisica();
		pf.setNome("Stefany");
		pf.setEndereco("Minha casa");
		pf.setCpf("111.111.111.11");
		pf.setTelefone("88888-8888");
		pf.mostrarDados();
		
		Aula07HerancaPessoaJuridica pj = new Aula07HerancaPessoaJuridica();
		
		pj.setCNPJ("11.111.111/0000-01");
		pj.setEndereco("Teste");
		pj.setNome("Stefany");
		pj.setTelefone("11111-1111");
		pj.mostrarDados();
		
		Aula07HerancaFuncionario funcionario = new Aula07HerancaFuncionario();
		funcionario.setCpf("000.000.000-00");
		funcionario.setEndereco("Rua tal");
		funcionario.setMatricula("7700155888");
		funcionario.setNome("Funcionario");
		funcionario.setTelefone("00000-0000");
		funcionario.mostrarDados();
		
		
	}

}
