import java.util.Scanner;
public class questao_14{
    public static void main(String[] args) {
        int A = 0; int B = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("Valores após a troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}