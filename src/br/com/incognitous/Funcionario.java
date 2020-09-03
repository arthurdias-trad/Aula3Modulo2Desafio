package br.com.incognitous;

import java.time.LocalDate;

public abstract class Funcionario {
	private String endereco;
	private String nome;
	private String cpf;
	private String email;
	private String setor;
	private LocalDate admissao;
	private LocalDate demissao;
	private float salarioBase;
	private boolean deFerias;
	private LocalDate ultimasFerias;

	
	public Funcionario(String endereco, String nome, String cpf, String email, String setor, LocalDate admissao, float salarioBase) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.admissao = admissao;
		this.salarioBase = salarioBase;
		this.ultimasFerias = admissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

	public LocalDate getDemissao() {
		return demissao;
	}

	public void setDemissao(LocalDate demissao) {
		this.demissao = demissao;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public boolean isDeFerias() {
		return deFerias;
	}

	public void setDeFerias(boolean deFerias) {
		this.deFerias = deFerias;
	}

	public LocalDate getUltimasFerias() {
		return ultimasFerias;
	}

	public void setUltimasFerias(LocalDate ultimasFerias) {
		this.ultimasFerias = ultimasFerias;
	}

	public abstract void verContracheque();
	
	public abstract void pedirFerias(LocalDate dataInicio);
	
	public abstract void trabalhar();
	
	public abstract void pedirDemissao();
	
}
