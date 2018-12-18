package br.com.caelum.contas.cap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(700);
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(200);
		ContaCorrente c3 = new ContaCorrente();
		c3.deposita(300);

		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Collections.sort(contas);
		
		System.out.println(contas);
	
	}

}
