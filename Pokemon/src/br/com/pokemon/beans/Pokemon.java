package br.com.pokemon.beans;

import java.util.Scanner;

public class Pokemon {
	private int idPokemon;
	private String nome;
	private String tipo;
	private String ataque;
	private int nivel;
	private Genero genero;
	private boolean shine;
	// variaveis estáticas existem somente o contexto da classe e não podem ser referenciadas.
	static int qntdPokemon = 0;
	
	Scanner s = new Scanner(System.in);
	
	
	public int getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAtaque() {
		return ataque;
	}
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public boolean isShine() {
		return shine;
	}
	public void setShine(boolean shine) {
		this.shine = shine;
	}
	
	
	public void cadastrarPokemon() {
		this.idPokemon = somaPokemon();
		System.out.print("Nome: ");
		this.setNome(s.next());
		System.out.print("Tipo: ");
		this.setTipo(s.next());
		System.out.println("Selecione o gênero: ");
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		System.out.println("3 - Genderless");
		System.out.println("4 - Bebê");
		int opcao = s.nextInt();
		
		
		while(opcao<1 || opcao>4) {
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
			case 3:
				this.setGenero(Genero.GENDERLESS);
				break;
			case 4:
				this.setGenero(Genero.BEBE);
				break;
			}
			
			System.out.println("Pokemon cadastrado com sucesso");
		
		
	}
	
	// gerando valor de id "autoincrement"
	public int somaPokemon() {
		return qntdPokemon++;
	}

}
