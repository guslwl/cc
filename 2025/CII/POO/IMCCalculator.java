import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = keyboard.nextDouble();

        System.out.print("Altura: ");
        double altura = keyboard.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f\n", imc);
    }
}