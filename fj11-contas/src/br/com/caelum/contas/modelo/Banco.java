package br.com.caelum.contas.modelo;

import java.util.Arrays;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
			}
		}
	}

	@Override
	public String toString() {
		return "Banco [nome = " + nome + ", numero = " + numero + "\nContas = " + Arrays.toString(contas) + "]";
	}

}
