package escola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turma a = new Turma();

        a.professor = new Professor();
        a.professor.nome = "Gustavo";
        
        a.alunos = new ArrayList<>();
        a.alunos.add(new Aluno());
        a.alunos.get(0).nome="Aluno 001";

        System.err.println(a.alunos.get(0).nome);
    }
}