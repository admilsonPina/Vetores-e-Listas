package Principal;

public class Aluno {
	private String nome;
    private int[] notas;

    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public double getMedia() {
        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
