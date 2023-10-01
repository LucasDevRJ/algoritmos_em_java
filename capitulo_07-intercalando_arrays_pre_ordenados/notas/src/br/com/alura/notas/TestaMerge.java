package br.com.alura.notas;

public class TestaMerge {

	public static void main(String[] args) {
		Nota[] notasDoAniche = {
			new Nota("andre", 4),
			new Nota("mariana", 5),
			new Nota("carlos", 8.5),
			new Nota("paulo", 9)
		};
		
		Nota[] notasDoAlberto = {
			new Nota("jonas", 3),
			new Nota("juliana", 6.7),
			new Nota("guilherme", 7),
			new Nota("lucia", 9.3),
			new Nota("ana", 10)
		};
		
		Nota[] rank = junta(notasDoAlberto, notasDoAniche);
		
		for (Nota nota : rank) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}
	}
	
	private static Nota[] junta(Nota[] notasDoAniche, Nota[] notasDoAlberto) {
		int total = notasDoAniche.length + notasDoAlberto.length;
		int atualDoAniche = 0;
		int atualDoAlberto = 0;
		int atual = 0;
		
		Nota[] resultado = new Nota[total];
		
		while (atualDoAniche < notasDoAniche.length 
			&& atualDoAlberto < notasDoAlberto.length) {
			
			Nota nota1 = notasDoAniche[atualDoAniche];
			Nota nota2 = notasDoAlberto[atualDoAlberto];
			System.out.println("Estou comparando " + nota1.getAluno() + 
					" com " + nota2.getAluno());
			if (nota1.getValor() < nota2.getValor()) {
				//mauriciu
				resultado[atual] = nota1;
				atualDoAniche++;
			} else {
				//alberto
				resultado[atual] = nota2;
				atualDoAlberto++;
			}
			atual++;
		}
		System.out.println("Estou saindo");
		System.out.println(atualDoAniche < notasDoAniche.length);
		while (atualDoAlberto < notasDoAlberto.length) {
			resultado[atual] = notasDoAlberto[atualDoAlberto];
			atual++;
			atualDoAlberto++;
		}
		while (atualDoAniche < notasDoAniche.length) {
			resultado[atual] = notasDoAniche[atualDoAniche];
			atual++;
			atualDoAniche++;
		}
		System.out.println(atualDoAlberto < notasDoAlberto.length);
		return resultado;
	}
}
