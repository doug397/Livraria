import br.com.livraria.Autor;
import br.com.livraria.CarrinhoDeCompras;
import br.com.livraria.produtos.Ebook;
import br.com.livraria.produtos.Livro;
import br.com.livraria.produtos.LivroFisico;
import br.com.livraria.produtos.MiniLivro;


public class Test {

	public static void main(String[] args) {
		
		Autor autor=new Autor();
		
		autor.setNome("Douglas de Jesus Fonseca");
		autor.setCpf("064.359.585-64");
		autor.setEmail("douglas.vasco@gmail.com");
		
		
		
		LivroFisico livro1= new LivroFisico("Java",autor);
		
		livro1.setDescricao("Logica de Programaçao");
		livro1.setIsbn("001-1234-2-132132");
		livro1.setValor(400);
		livro1.aplicaDescontoDe(0.08);
		
		livro1.mostraDetalhes();

		
		
		
		Ebook ebook= new Ebook("Ebook Java",autor);
		
		ebook.setDescricao("Livro Digital ");
		ebook.setWaterMark("Saraiva");
		ebook.setValor(200);
		ebook.aplicaDescontoDe(0.15);
		ebook.mostraDetalhes();
		
		
		
		
		
		MiniLivro minilivro= new MiniLivro("MiniLivro", autor);
		
		minilivro.setDescricao("Livro pequeno");
		minilivro.setIsbn("1234-2-23234-2");
		minilivro.setValor(200);
		minilivro.mostraDetalhes();
	
		
		
		
		
		
		CarrinhoDeCompras carrinho= new CarrinhoDeCompras();
		
		carrinho.adiciona(livro1);
		carrinho.adiciona(ebook);
		carrinho.adiciona(minilivro);
		
		
		System.out.println(carrinho.getTotal());
		
		
		
		

		
		
		
		
		

		


	}

}
