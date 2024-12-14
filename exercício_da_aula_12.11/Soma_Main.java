import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma_Main {
    static class ExcecaoAcimaDeCem extends Exception {
        public ExcecaoAcimaDeCem(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, n = 0;
        double media;

        try {
            while (true) {
                System.out.print("Digite um número: ");

                try {
                    int num = scanner.nextInt();
                    soma = soma + num;
                    n++;
                    if (soma > 100) {
                        throw new ExcecaoAcimaDeCem("A soma ultrapassou 100!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                    scanner.next();
                }
            }
        } catch (ExcecaoAcimaDeCem e) {
            System.out.println(e.getMessage());
        } finally {
            if (n > 0) {
                media = (double) soma / n;
                System.out.println("Soma total antes de exceder 100: " + soma);
                System.out.println("Quantidade de números somados: " + n);
                System.out.println("Média dos números: " + media);
            } else {
                System.out.println("Nenhum número válido foi inserido.");
            }
            scanner.close();
        }
    }
}
