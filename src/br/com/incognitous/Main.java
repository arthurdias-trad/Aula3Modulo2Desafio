package br.com.incognitous;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		FuncionarioPF funcionario = new FuncionarioPF("Rua das Palmeiras", "Jos� Silva", "123456789", "jose@email.com", "Manuten��o", LocalDate.of(2019, 12, 12), 1500.00f, "123456789123");
		FuncionarioPJ demitir = new FuncionarioPJ("Rua", "Jo�o Domingos", "321654987", "jo�o@email.com", "Manuten��o", LocalDate.of(2019, 12, 12), 1100f, "123456789321");
		
		demitir.pedirFerias();
		funcionario.demitirFuncionario(demitir);
			
	}

}
