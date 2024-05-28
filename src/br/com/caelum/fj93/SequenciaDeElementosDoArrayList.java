package caelum.fj93;

public class SequenciaDeElementosDoArrayList implements SequenciaDeElementos{

    private final ArrayList colecao;

    public SequenciaDeElementosDoArrayList(ArrayList colecao){
        this.colecao = colecao;
    }

    public Object proximo() {
        return null;
    }
}
