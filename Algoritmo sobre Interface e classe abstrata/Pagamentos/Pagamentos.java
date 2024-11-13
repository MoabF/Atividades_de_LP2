import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a opção que representa a forma de pagamento que você deseja realizar:" +
                "\n1-Cartão de crédito\n2-Boleto bancário\n3-PIX");
        n = entrada.nextInt();
        switch (n){
            case 1:
                CartãoCrédito pagamento = new CartãoCrédito();
                pagamento.autenticar();
                pagamento.realizarPagamento();
                break;
            case 2:
                BoletoBancario pagamento2 = new BoletoBancario();
                pagamento2.autenticar();
                pagamento2.realizarPagamento();
                break;
            case 3:
                PIX pagamento3 = new PIX();
                pagamento3.autenticar();
                pagamento3.realizarPagamento();
                break;
            default:
                System.out.println("Nenhuma forma de pagamento válida foi selecionada");
                break;
        }


    }
}
