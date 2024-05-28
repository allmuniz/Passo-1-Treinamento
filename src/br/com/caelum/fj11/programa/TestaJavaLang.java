package caelum.fj11.programa;

import caelum.fj11.modelo.Conta;
import caelum.fj11.modelo.GuardadorDeObjetos;

public class TestaJavaLang {
    public static void main(String[] args) {

        Conta c1 = new Conta(500.0);
        Conta c2 = new Conta(700.0);

        GuardadorDeObjetos armario = new GuardadorDeObjetos();
        armario.adiciona(c1);
        armario.adiciona(c2);

        Conta contaNoArmario = (Conta) armario.pega(0);

        System.out.println(contaNoArmario.getSaldo());
        System.out.println(c2);


        if (c1.equals(c2)){
            System.out.println("São iguais");
        }else {
            System.out.println("São diferentes ");
        }

        String curso = "fj11";
        curso = curso.replace("j", "k");
        System.out.println(curso);
        curso = curso.toUpperCase();
        System.out.println(curso);

        double pi = 3.1415;
        Long numeroArredondado = Math.round(pi);
        System.out.println(numeroArredondado);
    }
}
