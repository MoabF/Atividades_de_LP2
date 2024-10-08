import java.util.Scanner;
public class questao_11{
    public static void main(String[] args){
        float vel_m_s = 0.0f; double vel_k_h = 0.0d; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade em metros por segundo:");
        vel_m_s = scanner.nextFloat();
        if( vel_m_s >= 0){
            vel_k_h = vel_m_s * 3.6;
            System.out.println("A velocidade em quilômetros por hora é: " + vel_k_h + " k/h");
        }
        else{
            System.out.println("Número digitado não suportado");
        }
    }
}