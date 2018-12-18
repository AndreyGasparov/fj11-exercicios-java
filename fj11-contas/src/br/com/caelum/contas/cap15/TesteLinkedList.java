package br.com.caelum.contas.cap15;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente cc1 = new ContaCorrente();

		List lista = new ArrayList();

		List<ContaCorrente> contas = new LinkedList<>();

		Vector vetor = new Vector();
		String nome = "maria";

		vetor.addElement(cc);
		vetor.addElement(cc1);
		cc.deposita(100);
		cc1.deposita(200);

		System.out.println("get -> valor do índice '0': \t\t" + vetor.get(1));
		System.out.println("elementAt -> valor do índice '0': \t" + vetor.elementAt(1));
		System.out.println("firtElement -> valor do índice '0': \t" + vetor.firstElement());

		// for (int i = 0; i < 10; i++) {
		// ContaCorrente cc = contas.get(i);
		// cc.deposita(i*100);
		// }

		// for (int i = 0; i<contas.size(); i++) {
		// ContaCorrente cc = contas.get(i);
		// System.out.println(cc.getSaldo());
		// }

	}

}
