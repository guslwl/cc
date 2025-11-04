package escola;

public class Aluno {
    int matricula;
    String CPF;
    String nome;    

    Aluno() {
        System.out.println("Aluno criado sem parametros");
    }

    Aluno(int pMatricula, String pNome, String pCPF){
        matricula = pMatricula;
        CPF = pCPF;
        nome = pNome;
    }
    
    void printInfo() {
        System.out.println("ID: " + matricula);
        System.out.println("CPF: " + CPF);
        System.out.println("Nome: " + nome);
    }
}