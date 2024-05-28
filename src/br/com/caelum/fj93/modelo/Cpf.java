package caelum.fj93.modelo;

public record Cpf(String valor) implements Documento {

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

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador()
                == segundoDigitoCorreto();
    }

    private int primeiroDigitoVerificador() {
        return 1;
    }

    private int primeiroDigitoCorreto() {
        return 1;
    }

    private int segundoDigitoVerificador() {
        return 2;
    }

    private int segundoDigitoCorreto() {
        return 2;
    }
}
