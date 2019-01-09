package br.com.caellum.contas.cap15.revisado;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

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

		contas.add(1, conta1); // add()
		contas.add(2, conta2);
		conta2.deposita(200); // addAll()

		contas.addAll(listaNomes);

		for (int i = 0; i < contas.size(); i++) {
			System.out.println(" " + i + " - " + contas.get(i)); // get()
		}

		System.out.println("Contas na lista: " + contas.size()); // size()

		System.out.println("Contém conteúdo? " + contas.contains("Samantha")); // contains()
		System.out.println("Contém conteúdo? " + contas.containsAll(listaNomes)); // containsAll()

		System.out.println("Contém x elemento na lista? " + contas.equals(contas)); // equals()

		try {
			System.out.println(contas.get(5));
		} catch (Exception e) {
			System.out.println("Valor do índice está vázio");
		}

		System.out.println("HashCode da lista: " + contas.hashCode()); // hashcode()
		System.out.println("HashCode da lista: " + listaNomes.hashCode());

		// indexOf()
		if (contas.indexOf(listaNomes) == 0) {
			System.out.println("Contém na Lista");
		} else if (contas.indexOf(listaNomes) == -1) {
			System.out.println("Não contém na Lista");
		}

		System.out.println("Contém na Lista? " + contas.isEmpty()); // isEmpty()

		System.out.println("Interator: " + contas.iterator()); // interator()

		if (contas.lastIndexOf(1) != -1) {
			System.out.println(contas.lastIndexOf(listaNomes));
		} else {
			System.out.println("Não contém na lista");
		}

		System.out.println(contas.listIterator());

		// contas.remove(1);
		// contas.removeAll(listaNomes);

		// for (int i = 0; i < contas.size(); i++) {
		// System.out.println(" " + i + " - " + contas.get(i)); // get()
		// }

		contas.set(2, conta); //set(index, element)
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(" " + i + " - " + contas.get(i)); // get()
		}
		
//		contas.sort(c);

	}

}
