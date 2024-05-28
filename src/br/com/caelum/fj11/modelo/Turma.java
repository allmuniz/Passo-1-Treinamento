package caelum.fj11.modelo;

public class Turma {
    public Aluno[] alunos;

    public void imprimeNotas(){
        for (Aluno aluno : alunos) {
            if (aluno == null) continue;
            System.out.println(aluno.nota);
        }
    }
}
