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
		
		for (int atual = 0; atual < produtos.length; atual++) {
			int menor = buscaMenor(produtos, atual, produtos.length - 1);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
		
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
}
