package br.com.caelum.contas.modelo;

public class TestaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("BankofAndrey", 99);

		Conta cc = new ContaCorrente();
		cc.setAgencia(1);
		cc.setNumero(1234);
		cc.setTitular("marcos");
		banco.adiciona(cc);

		System.out.println(banco);
	}

}
