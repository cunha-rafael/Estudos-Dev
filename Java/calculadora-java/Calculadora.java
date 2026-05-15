import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== CALCULADORA ===");
    System.out.println("Digite o primeiro número:");

System.out.println("Escolha uma operação:");
System.out.println("1 - Somar");
System.out.println("2 - Subtrair");
System.out.println("3 - Multiplicar");
System.out.println("4 - Dividir");

int operacao = scanner.nextInt();

    double numero1 = scanner.nextDouble();
    System.out.println("Digite o segundo número:");

    double numero2 = scanner.nextDouble();
    switch (operacao) {

    case 1:
        System.out.println("Resultado: " + (numero1 + numero2));
        break;

    case 2:
        System.out.println("Resultado: " + (numero1 - numero2));
        break;

    case 3:
        System.out.println("Resultado: " + (numero1 * numero2));
        break;

    case 4:
        System.out.println("Resultado: " + (numero1 / numero2));
        break;

    default:
        System.out.println("Operação inválida");

}

    }

}