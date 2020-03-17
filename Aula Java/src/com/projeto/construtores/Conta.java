package com.projeto.construtores;

public class Conta {
	
	private int numeroConta;
	private double saldo;

	public Conta(int conta){
		//inicializar conta
		this.numeroConta = conta;
	}
	
	public void imprime() {
		System.out.println(this.numeroConta);
	}
}
