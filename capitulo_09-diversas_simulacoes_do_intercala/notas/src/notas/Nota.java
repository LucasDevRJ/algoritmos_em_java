package notas;

public class Nota {

	private String aluno;
	private Double nota;
	
	public Nota(String aluno, Double nota) {
		this.aluno = aluno;
		this.nota = nota;
	}
	
	public String getAluno() {
		return this.aluno;
	}
	
	public Double getNota() {
		return this.nota;
	}
}
