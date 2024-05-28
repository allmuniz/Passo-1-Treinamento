package caelum.fj11.programa;

import caelum.fj11.modelo.Aluno;
import caelum.fj11.modelo.Turma;

public class TesteDaTurma {
    public static void main(String[] args) {
        Turma fj11 = new Turma();
        fj11.alunos = new Aluno[10];

        fj11.alunos[0] = new Aluno();
        fj11.alunos[0].nome = "Mauricio";
        fj11.alunos[0].nota = 9;

        fj11.alunos[1] = new Aluno();
        fj11.alunos[1].nome = "Marcelo";
        fj11.alunos[1].nota = 5;

        fj11.alunos[2] = new Aluno();
        fj11.alunos[2].nome = "Adriano";
        fj11.alunos[2].nota = 7;

        fj11.imprimeNotas();
    }
}
