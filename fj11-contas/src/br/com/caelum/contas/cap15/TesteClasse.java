package br.com.caelum.contas.cap15;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteClasse {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.toString());
		
	}

}
