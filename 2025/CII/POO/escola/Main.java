package escola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turma a = new Turma();

        a.professor = new Professor(1, "Gustavo", "N/A");
        
        a.alunos = new ArrayList<>();
        a.alunos.add(new Aluno(1, "123.456.789-00", "Gustavo", "Ciencias da Computacao", new Avaliacao(7, 7, 9)));

        a.professor.printInfo();

        a.alunos.get(0).printInfo();
    }
}