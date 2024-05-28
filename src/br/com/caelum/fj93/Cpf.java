package caelum.fj93;

public class Cpf implements Documento {
    private final String valor;

    public Cpf(String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cpf)) {
            return false;
        }
        Cpf outro = (Cpf) o;
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
