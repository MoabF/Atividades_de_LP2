import java.util.Scanner;

public class questao_3_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = 0;

        System.out.println("Digite o ano:");
        ano = entrada.nextInt();

        if (ano%100 == 0) {
            if (ano%400 == 0) {
                System.out.println("O ano " + ano + " é bissexto.");
            }
            else{
                System.out.println("O ano " + ano + " não é bissexto.");   
            }
        } 
        else if (ano%4 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } 
        else{
            System.out.println("O ano " + ano + " não é bissexto.");   
        }
        entrada.close();
    }
}
