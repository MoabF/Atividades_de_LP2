import java.util.Scanner;

public class questao_7_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0; int fatorial = 1;

        System.out.println("Digite o número que você deseja calcular o fatorial:");
        n = entrada.nextInt();
        for(int i=1; i<n+1; i++){   
            fatorial = fatorial * i;
        }
        System.out.println("O resultado é: " + fatorial);
        entrada.close();
    }
}
