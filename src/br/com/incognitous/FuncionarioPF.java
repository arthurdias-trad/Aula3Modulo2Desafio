package br.com.incognitous;

import java.time.LocalDate;
import java.time.Period;

public class FuncionarioPF extends Funcionario implements Aumentavel {

	private String nit;
	private boolean gerente = false;
	private boolean supervisor = false;
	private float bonus;

	public FuncionarioPF(String endereco, String nome, String cpf, String email, String setor, LocalDate admissao,
			float salarioBase, String nit) {
		super(endereco, nome, cpf, email, setor, admissao, salarioBase);
		this.nit = nit;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public boolean isGerente() {
		return gerente;
	}

	public void setGerente(boolean gerente) {
		this.gerente = gerente;
		if (gerente == true && this.supervisor == true) {
			this.supervisor = false;
		}
		bonus = 0.12f;
	}

	public boolean isSupervisor() {
		return supervisor;
	}

	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
		if (this.gerente == true && supervisor == true) {
			this.gerente = false;
		}
		bonus = 0.08f;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public void verContracheque() {
		if (this.isGerente() || this.isSupervisor()) {
			float bonificacao = this.getSalarioBase() * bonus;
			System.out.println("Sal�rio:\t" + this.getSalarioBase() + "\nBonifica��o:\t" + bonificacao + "\n");
		} else {
			System.out.println("Sal�rio:\t" + this.getSalarioBase());
		}

	}

	@Override
	public void pedirFerias() {
		int tempoDeEmpresa = Period.between(this.getAdmissao(), LocalDate.now()).getMonths();
		int desdeAsUltimasFerias = Period.between(this.getUltimasFerias(), LocalDate.now()).getMonths();
		
		System.out.println(tempoDeEmpresa);
		
		if (tempoDeEmpresa >= 11 && desdeAsUltimasFerias >= 4) {
			this.setDeFerias(true);
			this.setUltimasFerias(LocalDate.now());
		} else {
			System.out.println("O funcion�rio n�o cumpre os requisitos para f�rias.");
		}

	}

	public void demitirFuncionario(Funcionario funcionario) {
		boolean isPJ = (FuncionarioPJ) funcionario instanceof FuncionarioPJ;

		if (this.gerente && (!((FuncionarioPF) funcionario).isGerente()) || isPJ) {
			funcionario.setDemissao(LocalDate.now());
		} else if (this.supervisor
				&& (!((FuncionarioPF) funcionario).isGerente() && !((FuncionarioPF) funcionario).isSupervisor()
						|| isPJ)) {
			funcionario.setDemissao(LocalDate.now());
		} else {
			System.out.println("Voc� n�o tem permiss�o para essa demiss�o.");
		}
	}
	
	public void reajustar(Funcionario funcionario, float valor) {
		if (!this.isGerente()) {
			System.out.println("Funcion�rio sem autoriza��o para reajustes");
		} else if (valor <= 0){
			System.out.println("Gerentes s� podem aumentar o sal�rio, o valor do reajuste deve ser positivo");
		} else if (((FuncionarioPF) funcionario).isGerente()) {
			System.out.println("Gerentes n�o podem reajustar outros gerentes");
		} else {
			funcionario.setSalarioBase(funcionario.getSalarioBase() + valor);
			System.out.println("Sal�rio reajustado");
		}
	}

	@Override
	public void trabalhar() {
		if (this.isDeFerias()) {
			System.out.println("Estou de f�rias");
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
