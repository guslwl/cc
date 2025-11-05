package escola;

public class Aluno {
    int matricula;
    String CPF, nome, curso;
    Avaliacao notas;

    Aluno() {
        System.out.println("Aluno criado sem parametros");
    }

    Aluno(int matricula, String CPF, String nome, String curso, Avaliacao notas) {
        this.matricula = matricula;
        this.CPF = CPF;
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void printInfo() {
        System.out.println("----------- INFO ALUNO -----------");;
        System.out.println("ID: " + matricula + "  CPF: " + CPF);
        System.out.println(nome);
        System.out.println(curso);
        System.out.println("---- Notas ----");
        System.out.println("N1: " + notas.nota1);
        System.out.println("N2: " + notas.nota2);
        System.out.println("N3: " + notas.nota3);
        System.out.println("Media :" + notas.mediaAritimetica());
        System.out.println("Media ponderada: " + notas.mediaPonderada());
        System.out.println("----------------------------------");
    }
}