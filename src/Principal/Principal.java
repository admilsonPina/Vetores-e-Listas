package Principal;

public class Principal {

	public static void main(String[] args) {
		
		VectorAluno alunos = new VectorAluno(3);
		alunos.lerAlunosDoArquivo("notas.csv");
		alunos.listar();
        alunos.ordenarNotas();
        alunos.mostrarMediaNotas();
        Disciplina disciplina = new Disciplina("CAA-CP", "Valerio");
        disciplina.adicionarAlunos(alunos);
        disciplina.alunoComMelhorNota();
    }
}

