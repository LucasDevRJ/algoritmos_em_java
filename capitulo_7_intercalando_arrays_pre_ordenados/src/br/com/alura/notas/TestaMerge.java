package br.com.alura.notas;

public class TestaMerge {

	public static void main(String[] args) {
		Nota[] notasDoAniche = {
				new Nota("Andre", 4),
				new Nota("Mariana", 5),
				new Nota("Carlos", 8.5),
				new Nota("Paulo", 9)
		};
		
		Nota[] notasDoAlberto = {
				new Nota("Jonas", 3),
				new Nota("Juliana", 6.7),
				new Nota("Guilherme", 7),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 10)
		};
		
		Nota[] rank = junta(notasDoAniche, notasDoAlberto);
		
		for (Nota nota : rank) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}
	}
	
	private static Nota[] junta(Nota[] notasDoAniche, Nota[] notasDoAlberto) {
		int atualDoAniche = 0;
		int atualDoAlberto = 0;
		int atual = 0;
		int total = notasDoAniche.length + notasDoAlberto.length;
		Nota[] resultado = new Nota[total];
		
		while (atualDoAniche < notasDoAniche.length 
				&& atualDoAlberto < notasDoAlberto.length) {
			
			Nota nota1 = notasDoAniche[atualDoAniche];
			Nota nota2 = notasDoAlberto[atualDoAlberto];
			System.out.println("Estou comparando " + nota1.getAluno() + 
					" com " + nota2.getAluno());
			
			if (nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atualDoAniche++;
			} else {
				resultado[atual] = nota2;
				atualDoAlberto++;
			}
			atual++;
		}
		System.out.println("Estou Saindo");
		System.out.println(atualDoAniche < notasDoAniche.length);
		while (atualDoAlberto <  notasDoAlberto.length) {
			resultado[atual] = notasDoAlberto[atualDoAlberto];
			atual++;
			atualDoAlberto++;
		}
		System.out.println(atualDoAlberto < notasDoAlberto.length);
		return resultado;
	}
}
