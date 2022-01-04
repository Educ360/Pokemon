package br.com.pokemon.beans;

import java.util.Scanner;

public class Treinador {
	private int idTreinador;
	private String nome;
	private int idade;
	private Insignia insignia; //lista
	private Pokebola pokebola; //lista
	private Pokedex pokedex;
	private Pokemon pokemon; //lista
	private Genero genero;
	private Item item; //lista de itens - pokebola, poção, fruta etc
	static int qntdTreinador = 0;
	
	Scanner s = new Scanner(System.in);
	Pokemon p = new Pokemon();
	
	public int somaTreinador() {
		return qntdTreinador++;
	}
	
	public void cadastraTreinador() {
		setIdTreinador(somaTreinador());
		System.out.print("Insira seu nome: ");
		setNome(s.next());
		System.out.print("Insira idade: ");
		setIdade(s.nextInt());
		System.out.println("Selecione o gênero: ");
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		int opcao = s.nextInt();
		
		
		while(opcao<1 || opcao>2) {
			System.out.println("Opção inválida!");
			System.out.println("Tente novamente! ");
			opcao = s.nextInt();
		}
			switch(opcao){
			case 1:
				this.setGenero(Genero.FEMININO);
				break;
			case 2:
				this.setGenero(Genero.MASCULINO);
				break;
			}
			
		System.out.print("Insira seu pokemon: ");
		p.cadastrarPokemon();
		System.out.println("Treinador Cadastrado com sucesso!");
		
	}
	
	// GET: metodo com retorno de dado = busca o atributo e retorna seu valor
	public int getIdTreinador() {
		return idTreinador; 
	}
	// SET: metodo de referência = atribuindo valor à variável referenciada
	public void setIdTreinador(int idTreinador) {
		this.idTreinador = idTreinador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Insignia getInsignia() {
		return insignia;
	}
	public void setInsignia(Insignia insignia) {
		this.insignia = insignia;
	}
	public Pokebola getPokebola() {
		return pokebola;
	}
	public void setPokebola(Pokebola pokebola) {
		this.pokebola = pokebola;
	}
	public Pokedex getPokedex() {
		return pokedex;
	}
	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	

}
