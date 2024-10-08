import java.util.Scanner;
public class questao_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int COMPRIMENTO = 0; int LARGURA = 0; int ALTURA = 0; int VOLUME = 0;
        System.out.println("Digite o valor do comprimento: ");
        COMPRIMENTO = scanner.nextInt();
        System.out.println("Digite o valor da largura: ");
        LARGURA = scanner.nextInt();
        System.out.println("Digite o valor da altura: ");
        ALTURA = scanner.nextInt();
        
        VOLUME = COMPRIMENTO * LARGURA * ALTURA;
        System.out.println("O volume da caixa retangular é: " + VOLUME + " M³");
    }
}