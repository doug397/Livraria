package br.com.livraria.produtos;

import br.com.livraria.Autor;

public class Ebook  extends Livro implements Promocional{
	
	private String waterMark;
	
	public Ebook(String nome, Autor autor) {
		super(nome, autor);
		
	}
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public String toString(){
		return "Eu sou um Ebook";
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem >0.15){
			return false;
		}
		
		double desconto= getValor()* porcentagem;
		this.setValor(getValor()-desconto);
		
		return true;
	}




}
