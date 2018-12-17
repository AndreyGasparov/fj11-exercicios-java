package br.com.caelum.contas.cap14;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TesteArray {

	public static void main(String[] args) {
		ContaCorrente contaNova = new ContaCorrente();

		double[] saldoDasContas;
		saldoDasContas = new double[10];

		saldoDasContas[5] = contaNova.getSaldo();

		// System.out.println(saldoDasContas[0]);

		int n = 10;
		int[] numeroDoBilhete = new int[n];

		ContaCorrente[] minhasContas = new ContaCorrente[n];
		contaNova.deposita(100.0);
		minhasContas[0] = contaNova;

		// System.out.println(minhasContas[0].toString());

		minhasContas[1] = new ContaCorrente();
		minhasContas[1].deposita(700.0);

		Conta[] minhasContas2 = new Conta[n];
		minhasContas2[0] = new ContaCorrente();
		minhasContas2[1] = new ContaPoupanca();

		// for (int count = 0; count < minhasContas.length; count++) {
		// System.out.print(" " + minhasContas2[count]);
		// }

		int[] idades = new int[n];

		for (int count = 0; count < minhasContas.length; count++) {
			idades[count] = 10 + 10 * count;
		}
//		for (int count = 0; count < minhasContas.length; count++) {
//			System.out.println(idades[count]);
//		}

		for (int count : idades) {
			System.out.println(count);
		}

	}

}
