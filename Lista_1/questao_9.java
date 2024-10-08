import java.util.Scanner;
public class questao_9{
    public static void main(String[] args){
        int decimal = 0; String binario = ""; int decimal_aux = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número menor que 32 para converter para binário:");
        decimal = scanner.nextInt();
        decimal_aux = decimal;
        if(decimal < 32){
            while(decimal > 0){
                binario = decimal%2 + binario;
                decimal = decimal/2;
            }
            System.out.println("O número " + decimal_aux + " em binário é: " + binario);
        }
        else{
            System.out.println("Número digitado não suportado");
        }
        
    }
}