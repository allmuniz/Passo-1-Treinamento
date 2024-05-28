package caelum.fj93.modelo;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas {
    private final Map<Documento, Divida> dividasNoBanco = new HashMap<>();

    public BancoDeDados() {
        System.out.println("Conectado");
    }
    public  void salva(Divida divida) {
        dividasNoBanco.put(divida.getDocumentoCredor(), divida);
        System.out.println("Ola " + divida.getCredor() + " divida de: " + divida.getTotal() + " salva!");
    }
    public Divida carrega(Documento documentoCredor) {
        return dividasNoBanco.get(documentoCredor);
    }
    public void desconecta() {
        System.out.println("Desconectado");
    }
}
