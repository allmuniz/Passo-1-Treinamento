package caelum.fj93.modelo;

public class Divida {

    private double total;
    private String credor;
    private Documento documentoCredor;

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }
    public String getCredor() {
        return credor;
    }
}
