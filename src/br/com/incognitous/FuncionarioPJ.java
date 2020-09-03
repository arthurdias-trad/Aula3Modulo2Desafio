package br.com.incognitous;

import java.time.LocalDate;
import java.time.Period;

public class FuncionarioPJ extends Funcionario implements Aumentavel {

	private String cnpj;
	
	public FuncionarioPJ(String endereco, String nome, String cpf, String email, String setor, LocalDate admissao,
			float salarioBase, String cnpj) {
		super(endereco, nome, cpf, email, setor, admissao, salarioBase);
		
		this.cnpj = cnpj;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void verContracheque() {
		System.out.println("Salário:\t" + this.getSalarioBase() + "\n");
	}

	@Override
	public void pedirFerias() {
		Period tempoDeEmpresa = Period.between(this.getAdmissao(), LocalDate.now());
		long mesesDeEmpresa = tempoDeEmpresa.toTotalMonths();  
		long desdeAsUltimasFerias = (int) Period.between(this.getUltimasFerias(), LocalDate.now()).toTotalMonths();
		
		
		if (mesesDeEmpresa >= 11 && desdeAsUltimasFerias >= 4) {
			this.setDeFerias(true);
			this.setUltimasFerias(LocalDate.now());
		} else {
			System.out.println("O funcionário não cumpre os requisitos para férias.");
		}
	}


	@Override
	public void trabalhar() {
		if (this.isDeFerias()) {
			System.out.println("Estou de férias");
		} else {
			System.out.println("Trabalhando...");
		}
	}


	@Override
	public void pedirDemissao() {
		this.setDemissao(LocalDate.now());
	}


	@Override
	public void pedirAumento(float valor) {
		if (Math.round(Math.random()) * valor < valor *0.2) {
			this.setSalarioBase(this.getSalarioBase() + valor);
		} else {
			System.out.println("Aumento negado.");
		}
	}
	
}
