package caelum.fj93;

public class BalancoEmpresa {
    private ArmazenadorDeDividas dividas;
    public BalancoEmpresa(ArmazenadorDeDividas dividas){
        this.dividas = dividas;
    }

    public void registraDividas(Divida divida){
        dividas.salva(divida);
    }

    public void pagaDividas(Documento documentoCredor, Pagamento pagamento){
        Divida divida = dividas.carrega(documentoCredor);
        if (divida != null){
            pagamento.registra(pagamento);
        }
        dividas.salva(divida);
    }
}
