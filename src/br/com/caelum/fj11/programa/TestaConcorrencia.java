package caelum.fj11.programa;

import caelum.fj11.modelo.BarraDeProgresso;
import caelum.fj11.modelo.Conta;
import caelum.fj11.modelo.CopiadorDeArquivos;
import caelum.fj11.modelo.FazDeposito;

public class TestaConcorrencia {
    public static void main(String[] args) throws InterruptedException {

        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();

        CopiadorDeArquivos copiador = new CopiadorDeArquivos();
        Thread t2 = new Thread(copiador);
        t2.start();

        Conta c1 = new Conta(500.0);
        FazDeposito acao = new FazDeposito(c1);
        Thread t3 = new Thread(acao);
        Thread t4 = new Thread(acao);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(c1.getSaldo());
    }
}
