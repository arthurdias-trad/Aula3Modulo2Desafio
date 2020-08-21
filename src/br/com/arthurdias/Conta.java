package br.com.arthurdias;

public class Conta {
	private String idDoCliente;
	private double saldo;
	
	public Conta(String idDoCliente, double saldo) {
		this.idDoCliente = idDoCliente;
		this.saldo = saldo;
	}

	public String getIdDoCliente() {
		return idDoCliente;
	}

	public void setIdDoCliente(String idDoCliente) {
		this.idDoCliente = idDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		double novoSaldo = getSaldo() + valor;
		setSaldo(novoSaldo);
		return novoSaldo;
	}
	
	public double sacar(double valor) {
		double saldo = getSaldo();
		if (saldo >= valor) {
			saldo -= valor;
			setSaldo(saldo);
		} else {
			System.out.println("Saldo insuficiente!");
		}
		return saldo;
	}
	

	@Override
	public String toString() {
		return "Conta " + idDoCliente + "\nSaldo:" + saldo;
	}
	
	
}
