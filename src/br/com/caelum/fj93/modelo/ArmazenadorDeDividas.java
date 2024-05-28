package caelum.fj93.modelo;

public interface ArmazenadorDeDividas {
    void salva(Divida divida);
    Divida carrega(Documento documentoCredor);
}
