package caelum.fj93;

public class Cnpj implements Documento {

    private final String valor;

    public Cnpj(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cnpj outro)) {
            return false;
        }
        return this.valor.equals(outro.valor);
    }

    @Override
    public int hashCode() {
        return this.valor.hashCode();
    }

    public boolean ehValido() {
        return  primeiroDigitoVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador()
                == segundoDigitoCorreto();
    }

    @Override
    public String getValor() {
        return "";
    }

    private int primeiroDigitoVerificador() {
        return 1;
    }
    private int primeiroDigitoCorreto(){
        return 1;
    }

    private int segundoDigitoVerificador() {
        return 2;
    }
    private int segundoDigitoCorreto() {
        return 2;
    }
}
