package caelum.fj93;

public class MinhaAplicacao {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");
        BalancoEmpresa balanco = new BalancoEmpresa(bd);
        registraDividas(balanco);
        realizaPagamentos(balanco);
        bd.desconecta();
    }

    public static void registraDividas(BalancoEmpresa balanco) {
        Divida divida1 = new Divida();
        Divida divida2 = new Divida();

        divida1.setCredor("Uma empresa");
        divida1.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
        divida1.setTotal(1000);

        divida2.setCredor("Meu vizinho");
        divida2.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
        divida2.setTotal(100);

        balanco.registraDividas(divida1);
        balanco.registraDividas(divida2);
    }

    public static void realizaPagamentos(BalancoEmpresa balanco) {
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();

        pagamento1.setDocumentoCredor(new Cnpj("00.000.002/0001-02"));
        pagamento1.setPagador("Uma empresa legal");
        pagamento1.setValor(500);

        pagamento2.setDocumentoCredor(new Cnpj("00.000.002/0001-02"));
        pagamento2.setPagador("Meu vizinho legal");
        pagamento2.setValor(50);

        balanco.pagaDividas(pagamento1.getDocumentoCredor(), pagamento1);
        balanco.pagaDividas(pagamento2.getDocumentoCredor(), pagamento2);
    }
}
