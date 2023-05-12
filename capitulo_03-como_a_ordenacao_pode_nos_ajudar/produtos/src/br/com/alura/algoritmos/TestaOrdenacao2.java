package br.com.alura.algoritmos;

public class TestaOrdenacao2 {

	public static void main(String[] args) {
		Produto produtos[] = {
				new Produto("Café com chocolate", 9.00),
				new Produto("Café com canela", 6.00),
				new Produto("Café expresso", 5.00),
				new Produto("Cappuccino", 8.00),
				new Produto("Café com leite", 7.00),
				new Produto("Chocolate quente", 9.00),
		};
		
		int produtoMaisCaro = buscaProdutoMaisCaro(produtos, 0, 4);
		
		System.out.println("O produto mais caro é o " + produtos[produtoMaisCaro].getNome());
		System.out.print("Custando R$ " + produtos[produtoMaisCaro].getPreco());
		
		System.out.println();
		System.out.println();
		
		//selectionSort(produtos, 4);
		novoSort(produtos, produtos.length);
		exibeLista(produtos);
	}

	private static void exibeLista(Produto[] produtos) {
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
	
	private static void selectionSort(Produto[] produtos, int quantidadeElementos) {
		for (int atual = 0; atual < produtos.length; atual++) {
			int produtoMaisCaro = buscaProdutoMaisCaro(produtos, atual, produtos.length);
			
			trocar(produtos, atual, produtoMaisCaro);
		}
	}

	private static void trocar(Produto[] produtos, int atual, int produtoMaisCaro) {
		Produto produtoAtual = produtos[atual];
		Produto produtoCaro = produtos[produtoMaisCaro];
		
		produtos[atual] = produtoCaro;
		produtos[produtoMaisCaro] = produtoAtual;
	}
	 
	private static void novoSort(Produto[] produtos, int quantidadeElementos) {
		for (int atual = 0; atual < quantidadeElementos; atual++) {
			int posterior = atual + 1;
			while (posterior < quantidadeElementos && produtos[atual].getPreco() > produtos[posterior].getPreco()) {
				trocar(produtos, atual, posterior);
				
				posterior++;
			}
		}
	} 
}
