package caelum.fj93.modelo;

public class BalancoEmpresa {
    private final ArmazenadorDeDividas dividas;
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
            divida.setTotal(divida.getTotal() - pagamento.getValor());
            System.out.println("Ola " + divida.getCredor() + " pagamento efetuado com sucesso: " + pagamento.getValor());
        }
        dividas.salva(divida);
    }
}
