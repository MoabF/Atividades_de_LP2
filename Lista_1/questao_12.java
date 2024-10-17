import java.util.Scanner;
public class questao_12{
    public static void main(String[] args){
        float R1 = 0.0f; float R2 = 0.0f; float R3 = 0.0f; 
        double req_paralelo = 0.0d; double req_final = 0.0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores dos resistores:");
        R1 = scanner.nextFloat(); R2 = scanner.nextFloat(); R3 = scanner.nextFloat();
        req_paralelo = (R1 * R2)/(R1 + R2);
        req_final = req_paralelo + R3;
        System.out.println("A resistênca equivalente é: " + req_final + " ohms");
        scanner.close();
    }
}