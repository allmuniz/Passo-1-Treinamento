package caelum.fj11.programa;

import caelum.fj11.modelo.Conta;

import java.util.*;

public class TestaColecoes {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        nomes.add("Jane");
        nomes.add("John");

        System.out.println(nomes.get(0));
        System.out.println(nomes.contains("John"));

        Collections.sort(nomes);
        System.out.println("Ordenado");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Set<Conta> contas = new HashSet<>();
        Conta c1 = new Conta(500.0);
        Conta c2 = new Conta(700.0);

        contas.add(c1);
        contas.add(c1);
        contas.add(c2);

        System.out.println(contas.size());

        Map<String, Conta> contasMap = new HashMap<>();
        Conta c3 = new Conta(500.0);
        Conta c4 = new Conta(700.0);

        contasMap.put("Diretor", c3);
        contasMap.put("Gerente", c4);

        System.out.println(contasMap.get("Diretor").getSaldo());
        System.out.println(contasMap.get("Gerente").getSaldo());
        System.out.println(contas.size());
    }
}
