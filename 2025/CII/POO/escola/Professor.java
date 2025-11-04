package escola;

public class Professor{
    String nome;
    String formacao;
    int cadastro;

    void info(){
        System.out.println("ID: " + cadastro);
        System.out.println("Nome: " + nome);
        System.out.println("Formacao: " + formacao);
    }
}