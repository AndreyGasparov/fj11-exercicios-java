package br.com.caelum.contas.cap15;

import java.util.*;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteCollectionsFramework {

	public static void main(String[] args) {
		// criar uma arrayList
		ArrayList lista = new ArrayList();
		// List lista = new ArrayList();

		lista.add("maria");
		lista.add("joao");

		ContaCorrente cc1 = new ContaCorrente();
		cc1.deposita(100);
		ContaCorrente cc2 = new ContaCorrente();
		cc2.deposita(200);
		ContaCorrente cc3 = new ContaCorrente();
		cc3.deposita(300);

		List contas = new ArrayList();
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);

		System.out.println("\n\t Quantidade de Itens na Lista: " + contas.size());

		System.out.println("Conteúdo da Lista Contas: ");
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i));
		}

		System.out.println("\n\t Conteúdo dos Saldos da Lista Contas: ");
		for (int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = (ContaCorrente) contas.get(i);
			System.out.println(cc.getSaldo());
		}

		// Remove Conteúdo da Lista Contas
		if (contas.remove(cc1) == true) {
			System.out.println("\nRemoção com sucesso!");
		} else {
			System.out.println("\nRemoção não concluída");
		}

		System.out.println("\n\t Quantidade de Contas: \t" + contas.size());
		for (int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = (ContaCorrente) contas.get(i);
			System.out.println(cc.getSaldo());
		}
		
		//contains
		System.out.println(contas.contains(cc1));
		
		
		
	}
}
