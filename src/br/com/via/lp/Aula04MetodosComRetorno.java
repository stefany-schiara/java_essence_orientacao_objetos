package br.com.via.lp;

public class Aula04MetodosComRetorno {

	
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double somar(int a, int b) {
		return a + b;
	}
	
	public static String pares(int valor) {
		String retorno = " Espaço";
		
		for (int a = 0; a <= valor; a = a + 2) {
			retorno += a + " Espaço";
		}
		
		return retorno;
	}
	
	public static int contarLetrasLenght(String palavra) {
		int quantidade = 0;
		
		quantidade = palavra.length();
		
		return quantidade;
	}
	
	public static int contarLetrasFor(String palavra) {
		int quantidade = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			quantidade++;
		}
		
		return quantidade;
	}
	
	public static void main(String[] args) {
		System.out.println(somar(10.1, 10.2));
		System.out.println(somar(1,1));
		System.out.println(pares(10));
		System.out.println(contarLetrasLenght("Stefany"));
		System.out.println(contarLetrasFor("Stefany"));
	}

}
