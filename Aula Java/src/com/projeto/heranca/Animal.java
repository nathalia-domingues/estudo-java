package com.projeto.heranca;

public class Animal {

	private String tamanhoAnimal;
	private double pesoAnimal;
	private String corAnimal;
	
	public void Correr() {
		System.out.println("Correr");
	}
	
	//getter e setter
	public void setCor(String cor) {
		this.corAnimal = cor;
	}
	
	public String getCor() {
	return this.corAnimal;
}
}
