package caelum.fj93.modelo;

public class For {
    public void percarreColecao(Colecao colecao) {

        SequenciaDeElementos sequencia = colecao.percorrerColecao();

        Object primeiro = sequencia.proximo();
        Object segundo = sequencia.proximo();
    }
}
