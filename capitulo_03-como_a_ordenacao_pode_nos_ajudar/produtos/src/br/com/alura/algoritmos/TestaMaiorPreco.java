package br.com.alura.algoritmos;

public class TestaMaiorPreco {
	public static void main(String[] args) {
		Produto produtos[] = {
				new Produto("Café Expresso", 5.00),
				new Produto("Cappuccino ", 8.00),
				new Produto("Café com leite ", 7.00),
				new Produto("Café com chocolate ", 9.00)
		};
		
		int produtoMaisCaro = buscaProdutoMaisCaro(produtos, 0, 4);
		
		System.out.println("O produto mais caro é o " + produtos[produtoMaisCaro].getNome());
		System.out.print("Custando R$ " + produtos[produtoMaisCaro].getPreco());
	}
	
	private static int buscaProdutoMaisCaro(Produto[] produtos, int inicio, int termino) {
		int produtoMaisCaro = inicio;
		for (int atual = inicio; atual < produtos.length; atual++) {
			if (produtos[atual].getPreco() > produtos[inicio].getPreco()) {
				produtoMaisCaro = atual;
			}
		}
		return produtoMaisCaro;
	}
}
