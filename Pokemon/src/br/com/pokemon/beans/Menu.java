package br.com.pokemon.beans;

import java.util.Scanner;

public class Menu {
	
	int opcao =-1;
	String opcao2;
	Scanner s = new Scanner(System.in);

	public void acessarMenu() {
		
		while (opcao !=3){
			System.out.println("Opção 1 = Cadastrar pokemon");
			System.out.println("Opção 2 = Cadastrar treinador");
			System.out.println("Opção 3 = Sair");
			opcao= s.nextInt();
			
			switch(opcao) {
			case 1:
				Pokemon pokemon = new Pokemon();
				pokemon.cadastrarPokemon();
				break;
			case 2:
				Treinador treinador = new Treinador();
				treinador.cadastraTreinador();
				break;
			}
			System.out.println("Deseja continuar? S/N");
			opcao2 = s.next().toLowerCase();
			
			if (opcao2.equals("s")) {
				opcao = 0;
			} else {
				opcao=3;
			}
			
		}
			
		
	}
}
