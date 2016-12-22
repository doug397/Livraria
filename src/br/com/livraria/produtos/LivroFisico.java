package br.com.livraria.produtos;

import br.com.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

	public LivroFisico(String nome, Autor autor) {
		super(nome, autor);
		
	}
	
	public double getTaxaImpressao(){
		return this.getValor() * 0.05;
	
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem > 0.3){
			return false;
		}
		double desconto= getValor() * porcentagem;
		this.setValor(getValor()-desconto);
		return true;
	}
	
	
			

}
