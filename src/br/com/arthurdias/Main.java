package br.com.arthurdias;

public class Main {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("123", 1234.58);
		
		System.out.println(conta1);
		
		conta1.sacar(2000);
		
		conta1.depositar(950.00);
		
		System.out.println(conta1.sacar(2000));

	}

}
