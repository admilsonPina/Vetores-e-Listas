package Principal;

import java.util.Arrays;

public class VectorAluno {
	private Aluno[] alunos;
    private int posicao;
    private int tamanho;

    public VectorAluno(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.posicao = 0;
        this.tamanho = tamanho;
    }

    public void inserir(Aluno aluno) {
        if (posicao < tamanho) {
            alunos[posicao] = aluno;
            posicao++;
        } else {
            System.out.println("Vector cheio!");
        }
    }
    public void listar() {
        for (int i = 0; i < posicao; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.print("Notas: ");
            int[] notas = alunos[i].getNotas();
            for (int j = 0; j < notas.length; j++) {
                System.out.print(notas[j] + " ");
            }   System.out.println("\n");
        }
    }
    
    public void mostrarMediaNotas() {
        for (int i = 0; i < posicao; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            double media = alunos[i].getMedia();
            System.out.printf("Media:"+ media);
            System.out.println("\n");
        }
    }
    
    public void ordenarNotas() {
    	System.out.println("Notas ordenadas de menor para melhor");
        for (int i = 0; i < posicao; i++) {
            int[] notas = alunos[i].getNotas();
            for (int j = 0; j < notas.length - 1; j++) {
                int indiceMenor = j;
                for (int k = j + 1; k < notas.length; k++) {
                    if (notas[k] < notas[indiceMenor]) {
                        indiceMenor = k;
                    }
                }
                int aux = notas[j];
                notas[j] = notas[indiceMenor];
                notas[indiceMenor] = aux;
                
            }
        }
        listar();
    }

    
    public Aluno pesquisar(String nome) {
        for (int i = 0; i < posicao; i++) {
            if (alunos[i].getNome().equals(nome)) {
                return alunos[i];
            }
        }
        return null;
    }
}
