package caelum.fj93.modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento> {


    private double valorPago;

    private void paga(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        if (valor > 100) {
            valor = valor - 8;

        }
        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
        this.add(pagamento);
        this.paga(pagamento.getValor());
    }

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data){
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this){
            if (pagamento.getData().before(data.getTime())){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo){
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this){
            if (pagamento.getValor() > valorMinimo){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosDo(Documento documentoCredor){
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this){
            if (pagamento.getDocumentoCredor().equals(documentoCredor)){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}
