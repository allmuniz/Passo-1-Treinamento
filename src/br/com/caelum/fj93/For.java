package caelum.fj93;

public class For {
    public void percarreColecao(Colecao colecao) {

        SequenciaDeElementos sequencia = colecao.percorrerColecao();

        Object primeiro = sequencia.proximo();
        Object segundo = sequencia.proximo();
    }
}
