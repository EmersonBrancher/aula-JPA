package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Emerson Brancher", "teste@gmail.com");
		Pessoa p2 = new Pessoa(2, "Emerson Antonio", "teste@hotmail.com");
		Pessoa p3 = new Pessoa(3, "Emerson Matheus", "teste@outlook.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
