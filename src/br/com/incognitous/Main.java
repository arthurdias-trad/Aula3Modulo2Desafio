package br.com.incognitous;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Gerente funcionario = new Gerente("Rua das Palmeiras", "Jos� Silva", "123456789", "jose@email.com", "Manuten��o", LocalDate.of(2018, 1, 1), 1500.00f, "123456789123");
		FuncionarioPJ demitir = new FuncionarioPJ("Rua", "Jo�o Domingos", "321654987", "jo�o@email.com", "Manuten��o", LocalDate.of(2010, 1, 1), 1100f, "123456789321");
		
		
		demitir.pedirAumento(8000);
		System.out.println(demitir.getSalarioBase());
		System.out.println(demitir.isDeFerias());
		funcionario.demitirFuncionario(demitir);
		System.out.println(demitir.getDemissao());
	}

}
