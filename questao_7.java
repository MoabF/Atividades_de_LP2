import java.util.Scanner;
public class questao_7{
    public static void main(String[] args){
        float F = 0.0f; float C = 0.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        F = scanner.nextFloat();
        
        C = ((F-32) * 5)/9; 
        
        System.out.println("A temperatura em Celsius é: " + C );
    }
}