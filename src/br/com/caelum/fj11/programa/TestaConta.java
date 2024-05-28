package caelum.fj11.programa;

import caelum.fj11.excecao.SaldoInsuficienteException;
import caelum.fj11.modelo.Cliente;
import caelum.fj11.modelo.Conta;

public class TestaConta {
    public static void main(String[] args) {

        Cliente dadosDoJoao = new Cliente();
        dadosDoJoao.setNome("Joao da Silva");

        Conta joao = new Conta(500.0);
        joao.setNumero(123);
        joao.setLimite(100.0);

        joao.deposita(200.0);
        try {
            joao.saca(600.0);
        }catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }


        System.out.println(joao.getSaldo());
    }
}
