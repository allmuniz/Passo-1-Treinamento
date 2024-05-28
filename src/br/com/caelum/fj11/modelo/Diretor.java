package caelum.fj11.modelo;

public class Diretor extends Funcionario implements Autenticavel {
    public double getBonus(){
        return this.salario * 0.35;
    }

    public  void cobrarRelatorios(){
        System.out.println("Preciso dos relatorios");
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
