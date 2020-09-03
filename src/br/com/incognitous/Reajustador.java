package br.com.incognitous;

public interface Reajustador {
	public void Reajustar(FuncionarioPF funcionario, float valor);
	public void Reajustar(FuncionarioPJ funcionario, float valor);
	public void Reajustar(Supervisor funcionario, float valor);
}
