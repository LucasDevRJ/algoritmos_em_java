package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto("Lamborghini", 1000000);
		
		int maisBarato = 0;
		for (int atual = 0; atual < 4; atual++) {
			if (precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
		}
		
		System.out.println("Indice do carro mais barato: " + maisBarato);
		System.out.println("Preço do carro mais barato: R$ " + precos[maisBarato]);
	}
}
