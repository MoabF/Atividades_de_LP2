import java.util.Scanner;

public class questao_6_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double euler = 1.0d; int n = 0; int fator = 1;

        System.out.println("Digite o 'n' para calcular o número de euler: ");
        n = entrada.nextInt();
        for(int i=1; i<n+1; i++){
           
            fator = fator * i;
            euler = euler + (1.0/fator);
        }
        System.out.println("O resultado é: " + euler);
        entrada.close();
    }
}
