package br.com.livraria.produtos;

import br.com.livraria.Autor;
import br.com.livraria.exception.AutorNuloException;
import br.com.livraria.exception.LivroNomeNuloException;

public abstract class Livro implements Produto {
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
		
	public Livro(String nome,Autor autor){
		if(nome==null){
			throw new LivroNomeNuloException("Nome do Livro Nullo");
		}
		if(autor==null){
			throw new AutorNuloException("Autor do Livro não pode ser Nulo");
		}
		this.nome=nome;
		this.autor= autor;
		this.isbn="000-00-00000-00-0";
		
	}
	
	public void mostraDetalhes(){
		
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Descrição: "+this.getDescricao());
		System.out.println("Valor: R$ "+this.getValor());
		System.out.println("ISBN: "+this.getIsbn());
		
		System.out.println("");
		if(this.temAutor()){
			autor.mostrarDetalhes();
		}
		System.out.println("________________________________");
	}
	
	
	boolean temAutor(){
		if(this.autor!=null){
			return true;
		}
		return false;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	public int compareTo(Produto outro) {
		
		if (this.getValor() < outro.getValor()){
			return -1;
		}
		if (this.getValor() > outro.getValor()){
			return 1;
		}
		return 0;
	}

}
