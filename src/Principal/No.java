package Principal;

public class No {
    private No anterior;
    private No proximo;
    private Aluno info;

    public No(Aluno info) {
        this.info = info;
    }


    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }
}
