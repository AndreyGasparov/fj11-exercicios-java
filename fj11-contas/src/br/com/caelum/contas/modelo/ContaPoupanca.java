package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta implements Tributavel {
	public String getTipo() {
		return "Conta Poupanca";
	}

	@Override
	public double getValorImposto() {
		return 0;
	}
}
