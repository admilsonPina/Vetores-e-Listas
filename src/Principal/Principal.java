package Principal;

public class Principal {

	public static void main(String[] args) {
	        Aluno ana = new Aluno("Ana", new int[]{15, 14, 13, 17, 18, 20});
	        Aluno joana = new Aluno("Joana", new int[]{17, 18, 12, 19, 15, 13});
	        Aluno paulo = new Aluno("Paulo", new int[]{7, 14, 15, 12, 17, 18});

	        VectorAluno vetor = new VectorAluno(3);
	        vetor.inserir(ana);
	        vetor.inserir(joana);
	        vetor.inserir(paulo);
	        vetor.listar ();
	        vetor.mostrarMediaNotas();
	        vetor.ordenarNotas ();

	        Aluno alunoPesquisado = vetor.pesquisar("Ana");
	        if (alunoPesquisado != null) {
	            System.out.println("Aluno encontrado: " + alunoPesquisado.getNome());
	        } else {
	            System.out.println("Aluno não encontrado!");
	        }
	    }
}

