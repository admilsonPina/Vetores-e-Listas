package Principal;

public class Aluno {
	private String nome;
    private double [] notas;

    public Aluno(String nome, double[] notas2) {
        this.nome = nome;
        this.notas = notas2;
    }


	public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

    public double getMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
