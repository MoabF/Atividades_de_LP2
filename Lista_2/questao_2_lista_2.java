import java.util.Scanner;

public class questao_2_lista_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String c = "";

        System.out.println("Digite o caractere:");
        c = entrada.nextLine();

        if (c.equals("0") || c.equals("1") || c.equals("2") || c.equals("3") || c.equals("4") || 
            c.equals("5") || c.equals("6") || c.equals("7") || c.equals("8") || c.equals("9")) {
            System.out.println("É um número.");
        } 
        else if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || 
                 c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) {
            System.out.println("É uma vogal.");
        } 
        else {
            System.out.println("É uma consoante.");
        }

        System.out.println(c);

        entrada.close();
    }
}
