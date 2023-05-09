package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {
		double precos[] = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 46000;
		precos[4] = 17000;
		
		int maisBarato = 0;
		int atual = 0;
		
		for (int i = 0; i < 4; i++) {
			if (precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
			atual = atual + 1;
		}
		
		System.out.println("Indice do carro mais barato: " + maisBarato);
		System.out.println("Preço do carro mais barato: R$ " + precos[maisBarato]);
	}
}
