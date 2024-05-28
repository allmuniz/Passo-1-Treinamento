package caelum.fj11.modelo;

abstract class Funcionario {

    protected double salario;
    private int senha;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    abstract   double getBonus();

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
