package br.com.incognitous;

import java.time.LocalDate;

public class Gerente extends FuncionarioPF implements Demitidor, Reajustador {

	private float bonus;
	
	public Gerente(String endereco, String nome, String cpf, String email, String setor, LocalDate admissao,
			float salarioBase, String nit) {
		super(endereco, nome, cpf, email, setor, admissao, salarioBase, nit);
		this.bonus = 0.12f;
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
	
	public void demitirFuncionario(Supervisor funcionario) {
		funcionario.setDemissao(LocalDate.now());
	}

	@Override
	public void Reajustar(FuncionarioPF funcionario, float valor) {
		if (valor <= 0) {
			System.out.println("Gerentes só podem aumentar o salário, o valor do reajuste deve ser positivo");
		} else {
			funcionario.setSalarioBase(funcionario.getSalarioBase() + valor);
			System.out.println("Salário reajustado");
		}
		
	}

	@Override
	public void Reajustar(FuncionarioPJ funcionario, float valor) {
		if (valor <= 0) {
			System.out.println("Gerentes só podem aumentar o salário, o valor do reajuste deve ser positivo");
		} else {
			funcionario.setSalarioBase(funcionario.getSalarioBase() + valor);
			System.out.println("Salário reajustado");
		}
		
	}

	@Override
	public void Reajustar(Supervisor funcionario, float valor) {
		if (valor <= 0) {
			System.out.println("Gerentes só podem aumentar o salário, o valor do reajuste deve ser positivo");
		} else {
			funcionario.setSalarioBase(funcionario.getSalarioBase() + valor);
			System.out.println("Salário reajustado");
		}
	}
}
