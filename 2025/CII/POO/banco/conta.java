package banco;

public class conta {
    int numero;
    String titular;
    double saldo;
    double limitePorSaque;

    conta(int numero, String titular, double saldo, double limitePorSaque)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limitePorSaque = limitePorSaque;
    }

    boolean sacar(double valorSaque) {
        if (valorSaque <= 0 || valorSaque > limitePorSaque || valorSaque > saldo){
            return false;
        }

        saldo -= valorSaque;
        return true;
    }

    boolean depositar(double valorDeposito){
        if (valorDeposito <= 0) {
            return false;
        }
        saldo += valorDeposito;
        return true;
    }

    void printInfo(){
       System.out.println("--------"); 
       System.out.println(numero + " | " + titular); 
       System.out.println("Saldo livre: R$ " + saldo); 
       System.out.println("Limite p. trans.: R$ " + limitePorSaque); 
       System.out.println("--------"); 
    }
}
