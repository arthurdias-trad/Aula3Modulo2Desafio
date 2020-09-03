package br.com.incognitous;

import java.time.LocalDate;

public class Supervisor extends FuncionarioPF implements Demitidor {
	private float bonus;
	
	public Supervisor(String endereco, String nome, String cpf, String email, String setor, LocalDate admissao,
			float salarioBase, String nit) {
		super(endereco, nome, cpf, email, setor, admissao, salarioBase, nit);
		this.bonus = 0.08f;
	}
	
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void verContracheque() {
		float bonificacao = this.getSalarioBase() * bonus;
		System.out.println("Salário:\t" + this.getSalarioBase() + "\nBonificação:\t" + bonificacao + "\n");
	}
	
	@Override
	public void demitirFuncionario(FuncionarioPF funcionario) {
		funcionario.setDemissao(LocalDate.now());
	}
	
	@Override
	public void demitirFuncionario(FuncionarioPJ funcionario) {
		funcionario.setDemissao(LocalDate.now());
	}
	
}
