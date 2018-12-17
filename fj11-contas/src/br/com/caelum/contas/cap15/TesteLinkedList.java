package br.com.caelum.contas.cap15;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		List lista = new ArrayList();	
		List<ContaCorrente> contas = new LinkedList<>();

//		for (int i = 0; i < 10; i++) {
//			ContaCorrente cc = contas.get(i);
//			cc.deposita(i*100);
//		}
		
		for (int i = 0; i<contas.size(); i++) {
			ContaCorrente cc = contas.get(i);
			System.out.println(cc.getSaldo());
		}

	}

}
