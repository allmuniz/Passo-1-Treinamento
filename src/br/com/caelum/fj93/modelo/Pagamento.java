package caelum.fj93.modelo;

import java.util.Date;

public class Pagamento {

    private String pagador;
    private Documento documentoCredor;
    private double valor;

    public Date getData() {
        return data;
    }

    private Date data;

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void registra(Pagamento pagamento) {
        Pagamentos pagamentos = new Pagamentos();
        pagamentos.registra(pagamento);
    }
}
