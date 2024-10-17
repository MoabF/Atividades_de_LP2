import java.util.Scanner;
public class questao_5{
    public static void main(String[] args){
        int num1 = 0; int num2 = 0;
        int quociente = 0; int resto = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo:");
        num1 = scanner.nextInt();
        System.out.println("Agora digite o divisor:");
        num2 = scanner.nextInt();
        quociente = num1/num2; 
        resto= num1%num2;
        System.out.println("O quociente é: " + quociente);
        System.out.println("O resto é: " + resto);
        scanner.close();
    }
}