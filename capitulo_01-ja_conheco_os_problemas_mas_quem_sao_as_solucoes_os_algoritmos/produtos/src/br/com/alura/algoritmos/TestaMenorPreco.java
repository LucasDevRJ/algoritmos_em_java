package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {
		Produto produtos[] = {
			new Produto("Lamborghini", 1000000),
			new Produto("Jipe", 46000),
			new Produto("Brasília", 16000),
			new Produto("Smart", 46000),
			new Produto("Fusca", 17000)
		};
		
		int maisBarato = buscaMenor(produtos);
		
		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome() + " é o mais barato, e custa " + produtos[maisBarato].getPreco());
	}
	
	private static int buscaMenor(Produto[] produtos) {
		int maisBarato = 0;
		for (int atual = 0; atual <= 4; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
}
