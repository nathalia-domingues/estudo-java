package com.projeto.conta;

public class ClassePrincipal {

	public static void main(String[] args) {
	
		Conta conta = new Conta();
		conta.depositar(200);
		conta.sacar(100);
		
		
		conta.minhaPropriedadeProtegida = "Teste";
		
		System.out.println(conta.minhaPropriedadeProtegida);
		System.out.println(conta.retornarSaldo());
		System.out.println(conta.numeroConta());
	}

}
