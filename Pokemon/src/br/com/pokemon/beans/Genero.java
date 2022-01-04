package br.com.pokemon.beans;


public enum Genero {
	
	
	FEMININO(1), MASCULINO(2), GENDERLESS(3), BEBE(4);
	
	private final int valor;
	
	Genero(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
	
	

}
