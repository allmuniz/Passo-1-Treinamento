package caelum.fj93.modelo;

public record Cnpj(String valor) implements Documento {

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cnpj outro)) {
            return false;
        }
        return this.valor.equals(outro.valor);
    }

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador()
                == segundoDigitoCorreto();
    }

    @Override
    public String valor() {
        return "";
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
