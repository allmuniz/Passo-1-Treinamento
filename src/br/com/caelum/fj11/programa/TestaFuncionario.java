package caelum.fj11.programa;

import caelum.fj11.modelo.*;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente joaquin = new Gerente();
        joaquin.setSalario(2000.0);
        joaquin.cobrarEntrega();
        joaquin.autentica(123);
        System.out.println(joaquin.getBonus());

        Diretor roberto = new Diretor();
        roberto.setSalario(3000.0);
        roberto.cobrarRelatorios();
        System.out.println(roberto.getBonus());

        Desenvolvedor allan = new Desenvolvedor();
        allan.setSalario(800.0);
        System.out.println(allan.getBonus());

        DBA joao = new DBA();
        joao.setSalario(1100.0);
        System.out.println(joao.getBonus());

        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adiciona(joaquin);
        totalizador.adiciona(roberto);
        totalizador.adiciona(allan);
        totalizador.adiciona(joao);

        System.out.println(totalizador.getTotal());
    }
}
