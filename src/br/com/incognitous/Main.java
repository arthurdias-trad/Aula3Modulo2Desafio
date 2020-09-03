package br.com.incognitous;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Gerente funcionario = new Gerente("Rua das Palmeiras", "José Silva", "123456789", "jose@email.com", "Manutenção", LocalDate.of(2018, 1, 1), 1500.00f, "123456789123");
		FuncionarioPJ demitir = new FuncionarioPJ("Rua", "João Domingos", "321654987", "joão@email.com", "Manutenção", LocalDate.of(2010, 1, 1), 1100f, "123456789321");
		
		
		demitir.pedirAumento(8000);
		System.out.println(demitir.getSalarioBase());
		System.out.println(demitir.isDeFerias());
		funcionario.demitirFuncionario(demitir);
		System.out.println(demitir.getDemissao());
	}

}
