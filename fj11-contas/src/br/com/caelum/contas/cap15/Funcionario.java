package br.com.caelum.contas.cap15;

import java.lang.Comparable;

public class Funcionario implements Comparable<Funcionario> {
	private int cpf;
	private String nome;

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", nome=" + nome + "]";
	}

//	public int compareTo(Funcionario outro) {
//		if (this.cpf < outro.cpf) {
//			return -1;
//		}
//		if (this.cpf > outro.cpf) {
//			return 1;
//		}
//
//		return 0;
//	}
//
	@Override
	public int compareTo(Funcionario o) {
		return 0;
	}

}
