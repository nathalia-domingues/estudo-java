package com.projeto.conta;

public class Conta {
	
private int numeroConta = 1212;
private double saldo=100;

protected String minhaPropriedadeProtegida;


public void depositar(double valorDepositar) {
	this.saldo = this.saldo + valorDepositar;
}

public void sacar(double valorSacar) {
	this.saldo = this.saldo - valorSacar;
}

public double retornarSaldo() {
	return this.saldo;
}

public int numeroConta() {
	return this.numeroConta;
}
}
