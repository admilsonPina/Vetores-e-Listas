package Principal;

public class Disciplina {
    private String titulo;
    private String docente;
    private Lista listaAlunos;

    public Disciplina(String titulo, String docente) {
        this.titulo = titulo;
        this.docente = docente;
        this.listaAlunos = new Lista();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDocente() {
        return docente;
    }

    public void setNomeDocente(String docente) {
        this.docente = docente;
    }

    public Lista getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(Lista listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    public void adicionarAlunos(VectorAluno vetor) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            Aluno aluno = vetor.get(i);
            listaAlunos.adicionarAluno(aluno);
        }
    }  
    public Aluno alunoComMelhorNota() {
        if (listaAlunos.isVazia()) {
            System.out.println("Nao a alunos na disciplina!");
            return null;
        }
        
        No atual = listaAlunos.getInicio();
        Aluno melhorAluno = atual.getInfo();
        double melhorMedia = melhorAluno.getMedia();
        
        while (atual != null) {
            double mediaAtual = atual.getInfo().getMedia();
            if (mediaAtual > melhorMedia) {
                melhorAluno = atual.getInfo();
                melhorMedia = mediaAtual;
            }
            atual = atual.getProximo();
        }
        
        System.out.println("Aluno com a melhor media na disciplina: " + melhorAluno.getNome() + " (media: " + melhorMedia + ")");
        return melhorAluno;
    }

}
