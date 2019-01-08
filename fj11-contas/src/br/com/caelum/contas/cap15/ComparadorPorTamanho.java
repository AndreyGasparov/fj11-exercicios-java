package br.com.caelum.contas.cap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.*;

public class ComparadorPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length()< s2.length())
			return -1;
		if (s2.length()< s1.length())
			return 1;
		return 0;
		
		// List <String> lista = new ArrayList<String>();
		// lista.add("Samantha");
		// lista.add("Fontelle");
		//
		// ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		// Collections.sort(lista, comparador);
		//
		// System.out.println(lista);
			
	}
}
