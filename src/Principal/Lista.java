package Principal;

public class Lista {
    private No primeiro;
    private No ultimo;
    private int tamanho;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public No getInicio() {
        return primeiro;
    }

    public boolean isVazia() {
        return (this.primeiro == null);
    }

    public int tamanho() {
        return this.tamanho;
    }
    public void adicionarAluno(Aluno aluno) {
        No novoNo = new No(aluno);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
            novoNo.setAnterior(atual);
        }
        tamanho++;
    }

    public void inserirInicio(Aluno aluno) {
        No novoNo = new No(aluno);
        if (isVazia()) {
            this.ultimo = novoNo;
        } else {
            this.primeiro.setAnterior(novoNo);
            novoNo.setProximo(this.primeiro);
        }
        this.primeiro = novoNo;
        this.tamanho++;
    }

    public void inserirFinal(Aluno aluno) {
        No novoNo = new No(aluno);
        if (isVazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void removerInicio() {
        if (!isVazia()) {
            if (this.primeiro == this.ultimo) {
                this.ultimo = null;
            } else {
                this.primeiro.getProximo().setAnterior(null);
            }
            this.primeiro = this.primeiro.getProximo();
            this.tamanho--;
        }
    }

    public void removerFinal() {
        if (!isVazia()) {
            if (this.primeiro == this.ultimo) {
                this.primeiro = null;
            } else {
                this.ultimo.getAnterior().setProximo(null);
            }
            this.ultimo = this.ultimo.getAnterior();
            this.tamanho--;
        }
    }
    
    public void inserirPos(int posicao, Aluno aluno) {
        if (posicao < 0 || posicao > tamanho) {
        	System.out.println("Posição inválida!");
            return;
        }
        No novoNo = new No(aluno);
        if (posicao == 0) {
            inserirInicio(aluno);
        } else if (posicao == tamanho) {
            inserirFinal(aluno);
        } else {
            No atual = getNo(posicao);
            No anterior = atual.getAnterior();
            novoNo.setAnterior(anterior);
            novoNo.setProximo(atual);
            anterior.setProximo(novoNo);
            atual.setAnterior(novoNo);
            tamanho++;
        }
    }

    public void removerPos(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
        	System.out.println("Posição inválida!");
            return;
        }
        if (posicao == 0) {
            removerInicio();
        } else if (posicao == tamanho - 1) {
            removerFinal();
        } else {
            No atual = getNo(posicao);
            No anterior = atual.getAnterior();
            No posterior = atual.getProximo();
            anterior.setProximo(posterior);
            posterior.setAnterior(anterior);
            tamanho--;
        }
    }

    private No getNo(int posicao) {
        No atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }


}
