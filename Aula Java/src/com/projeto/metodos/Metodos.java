package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		int resultado;
		resultado = multiplica(2, 5);
		System.out.println(resultado + 2);
	}

	public static void metodoEx() {
		// corpo do metodo
		System.out.println("Metodo exemplo");
	}

	public static int multiplica(int numero1, int numero2) {
		int resultado = 0;
		resultado = numero1 * numero2;
		return resultado;
		}
}
