package br.com.arthurdias;

public class Cliente {
	
	private String sobrenome;
	private String idDoCliente;
	private String cpf;
	private String rg;
	
	public Cliente(String sobrenome, String idDoCliente, String cpf, String rg) {
		this.sobrenome = sobrenome;
		this.idDoCliente = idDoCliente;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getIdDoCliente() {
		return this.idDoCliente;
	}

	public void setIdDoCliente(String idDoCliente) {
		this.idDoCliente = idDoCliente;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRG() {
		return this.rg;
	}
	
	public void setRG(String rg) {
		this.rg = rg;
	}
	
}
