package caelum.fj93;

public class SequenciaDeElementosDoHashSet implements SequenciaDeElementos {
    private final HashSet colecao;

    public SequenciaDeElementosDoHashSet(HashSet colecao){
        this.colecao = colecao;
    }

    public Object proximo() {
        return null;
    }
}
