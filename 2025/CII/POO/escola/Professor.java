package escola;

public class Professor{
    String nome;
    String formacao;
    int cadastro;

    Professor(int cadastro, String nome, String formacao){
        this.cadastro = cadastro;
        this.nome = nome;
        this.formacao = formacao;
    }

    void printInfo(){
        System.out.println("ID: " + cadastro);
        System.out.println("Nome: " + nome);
        System.out.println("Formacao: " + formacao);
    }
}