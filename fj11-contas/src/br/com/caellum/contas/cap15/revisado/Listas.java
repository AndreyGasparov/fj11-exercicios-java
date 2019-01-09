package br.com.caellum.contas.cap15.revisado;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Listas {

	public static void main(String[] args) {

		List listaNomes = new ArrayList();

		listaNomes.add("Samantha");
		listaNomes.add("Fontinele");

		Conta conta = new ContaCorrente();
		List contas = new ArrayList();
		conta.deposita(100);
		conta.setTitular("Samantha");
		contas.add(conta);
		// System.out.println(conta.getSaldo());

		// contas.clear();
		// System.out.println("Uso do método clear()");
		// System.out.println("Contas na lista: " + contas.size());

		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();

		contas.add(1, conta1);
		contas.add(2, conta2);
		conta2.deposita(200);

		contas.addAll(listaNomes);

		for (int i = 0; i < contas.size(); i++) {
			System.out.println(" " + i + " - " + contas.get(i));
		}

		System.out.println("Contas na lista: " + contas.size());
		
		System.out.println("Contém conteúdo? "+contas.contains(listaNomes)); 
		
	}

}
