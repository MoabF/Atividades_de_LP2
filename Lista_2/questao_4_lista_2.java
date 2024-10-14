import java.util.Scanner;

public class questao_4_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 0;
    
        do {
            System.out.println("Digite a senha: ");
            senha = entrada.nextInt();
    
            if (senha == 1234) {
                System.out.println("ACESSO PERMITIDO");
            } 
            else {
                System.out.println("ACESSO NEGADO. \nTente novamente.");
            }
        } while (senha != 1234);
    
        entrada.close();
        }
    }