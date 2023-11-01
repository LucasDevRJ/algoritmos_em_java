package notas;

public class TestaIntercalaEmUmArray {

	public static void main(String[] args) {
		Nota[] notas = {
				new Nota("Andre", 4.0),
				new Nota("Mariana", 5.0),
				new Nota("Carlos", 8.5),
				new Nota("Paulo", 9.0),
				new Nota("Jonas", 3.0),
				new Nota("Juliana", 6.7),
				new Nota("Guilherme", 7.0),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 10.0),
		};
		
		Nota[] rank = intercala(notas, 0, 4, notas.length);
		for (Nota nota : rank) {
			System.out.println(nota.getAluno() + " - " + nota.getNota());
		}	
	}
	
	private static Nota[] intercala(Nota[] notas, int inicial, int miolo, int termino) {
		Nota[] resultado = new Nota[termino - inicial];
		int atual = 0;
		int atual1 = inicial;
		int atual2 = miolo;
	
		while (atual1 < miolo && atual2 < termino) {
			Nota notas1 = notas[atual1];
			Nota notas2 = notas[atual2];
			
			if (notas1.getNota() < notas2.getNota()) {
				resultado[atual] = notas1;
				atual1++;
			} else {
				resultado[atual] = notas2;
				atual2++;
			}
			atual++;
		}
		
		while (atual1 < miolo) {
			resultado[atual] = notas[atual1];
			atual1++;
			atual++;
		}
		
		while (atual2 < termino) {
			resultado[atual] = notas[atual2];
			atual2++;
			atual++;
		}	
		
		for (int contador = 0; contador < atual; contador++) {
			notas[inicial + contador] = resultado[contador];
		}
		
		return notas;
	}
}
