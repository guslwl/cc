package banco;

public class main {
    public static void main(String[] args) {
        conta a = new conta(1, "Gustavo", 200, 20);
        
        a.printInfo();

        boolean saque = a.sacar(200);
        if (saque) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque nao realizado");
        }

        boolean saque2 = a.sacar(20);
        if (saque2) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque nao realizado");
        }

        a.depositar(50);

        a.printInfo();
    }
}