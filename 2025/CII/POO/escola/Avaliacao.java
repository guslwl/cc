package escola;

public class Avaliacao {

    double nota1, nota2, nota3;

    Avaliacao(){
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    } 

    Avaliacao(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3; 
    }

    double mediaAritimetica() {
        return (nota1 + nota2 + nota3)/3;
    }
    double mediaPonderada() {
        return ((nota1 * 2) + (nota2 * 3) + (nota3 * 4))/(2 + 3 + 4);
    }

}
