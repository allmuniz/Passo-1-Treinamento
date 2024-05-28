package caelum.fj11.modelo;

public class Cliente implements Autenticavel {

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    private String endereco;

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
