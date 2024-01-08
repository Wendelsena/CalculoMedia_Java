import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Média");
        System.out.print("Quantos números você deseja inserir? ");
        
        int quantidadeNumeros = scanner.nextInt();
        double soma = 0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o número #" + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / quantidadeNumeros;
        
        System.out.println("A média dos números é: " + media);

        
        scanner.close();
    }
}


