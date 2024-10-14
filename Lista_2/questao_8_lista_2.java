import java.util.Scanner;

public class questao_8_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;        
        System.out.println("Digite um número natural inteiro par: ");
        num = entrada.nextInt();
        if (num % 2 != 0) {
            System.out.println("O número digitado não é par.");
        } 
        else {
            int divisor = 1;        
            System.out.println("Os divisores de " + num + " são:");
            while (divisor <= num) {
                if (num % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            }
        }
                
    entrada.close(); // Fechar o scanner
    }
}
        