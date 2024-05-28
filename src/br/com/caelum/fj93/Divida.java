package caelum.fj93;

public class Divida {

    private double total;
    private String credor;
    private Documento documentoCredor;
    private Pagamentos pagamentos = new Pagamentos();

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }
}
