package br.com.alura.algoritmos;

public class TestaOrdenacao2 {

	public static void main(String[] args) {
		Produto produtos[] = {
				new Produto("Café expresso", 5.00),
				new Produto("Cappuccino", 8.00),
				new Produto("Café com leite", 7.00),
				new Produto("Café com chocolate", 9.00)
		};
		
		int produtoMaisCaro = buscaProdutoMaisCaro(produtos, 0, 4);
		
		System.out.println("O produto mais caro é o " + produtos[produtoMaisCaro].getNome());
		System.out.print("Custando R$ " + produtos[produtoMaisCaro].getPreco());
		
		System.out.println("\n\nOrdenando lista em ordem crescente");
		
		ordena(produtos, 4);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " - " + produto.getPreco());
		}
	}
	
	private static int buscaProdutoMaisCaro(Produto[] produtos, int inicio, int termino) {
		int produtoMaisCaro = inicio;
		for (int atual = inicio; atual < produtos.length; atual++) {
			if (produtos[atual].getPreco() > produtos[produtoMaisCaro].getPreco()) {
				produtoMaisCaro = atual;
			}
		}
		return produtoMaisCaro;
	}
	
	private static void ordena(Produto[] produtos, int quantidadeElementos) {
		for (int atual = 0; atual < produtos.length; atual++) {
			int produtoMaisCaro = buscaProdutoMaisCaro(produtos, atual, produtos.length);
			
			Produto produtoAtual = produtos[atual];
			Produto produtoCaro = produtos[produtoMaisCaro];
			
			produtos[atual] = produtoCaro;
			produtos[produtoMaisCaro] = produtoAtual;
		}
	}
}
