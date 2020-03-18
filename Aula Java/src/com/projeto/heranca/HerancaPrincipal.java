package com.projeto.heranca;

public class HerancaPrincipal {

	public static void main(String[] args) {

		Passaro passaro = new Passaro();
		passaro.Correr();
		passaro.setCor("Azul");
		passaro.voar();

		System.out.println(passaro.getCor());
		
		Cao cao = new Cao();
		cao.latir();
		cao.correr();
	}

}
