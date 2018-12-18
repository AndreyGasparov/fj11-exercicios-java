package br.com.caelum.contas.modelo;

import br.com.caelum.contas.testeErros.SaldoInsuficienteException;
import java.lang.Comparable;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

	// public ContaCorrente() {
	// toString();
	// }

	public String getTipo() {
		return " Corrente";
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");

		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	// public void saca(double valor) throws SaldoInsufienteException {
	// if (this.saldo < valor) {
	// throw new SaldoInsufienteException("saldo insuficiente");
	// } else {
	// this.saldo -= (valor + 0.10);
	// }
	// }

	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	// @Override
	// public String getTipo() {
	// return null;
	// }

	@Override
	public int compareTo(ContaCorrente outro) {
		if (this.saldo < outro.saldo) {
			return -1;
		}
		if (this.saldo > outro.saldo) {
			return 1;
		}
		return 0;
	}

	// @Override
	// public String toString() {
	// return " Conta Corrente ";
	// }
}
