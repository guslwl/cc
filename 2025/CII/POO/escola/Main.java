package escola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turma a = new Turma();

        a.professor = new Professor(1, "Gustavo", "N/A");
        
        a.alunos = new ArrayList<>();
        a.alunos.add(new Aluno(1, "Aluno 01", "123.456.789-01"));

        a.professor.printInfo();
    }
}