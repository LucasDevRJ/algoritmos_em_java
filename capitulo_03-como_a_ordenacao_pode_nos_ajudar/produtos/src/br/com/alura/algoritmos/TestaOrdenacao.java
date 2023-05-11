package br.com.alura.algoritmos;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Produto produtos[] = {
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasília", 16000),
				new Produto("Smart", 46000),
				new Produto("Fusca", 17000)
		};
		
		//selectionSort(produtos, produtos.length);
		novoSort(produtos, produtos.length);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for (int atual = inicio; atual <= termino; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
	
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
			System.out.println("Estou na casinha " + atual);
			
			int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
			
			System.out.println("Trocando o " + atual + " com " + menor);
			
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			
			System.out.println("Trocando o " + produtoAtual.getNome() + " por " + produtoMenor.getNome());
			
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
	}
	
	private static void novoSort(Produto[] produtos, int quantidadeElementos) {
		for (int atual = 0; atual < quantidadeElementos; atual++) {
			int analise = atual;
			
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				Produto produtosAnalise = produtos[analise];
				Produto produtoAnaliseMenos1 = produtos[analise - 1];
				
				produtos[analise] = produtoAnaliseMenos1;
				produtos[analise - 1] = produtosAnalise;
				analise--;
			}
		}
	}
}
