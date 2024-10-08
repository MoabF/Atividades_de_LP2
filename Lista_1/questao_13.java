import java.util.Scanner;
public class questao_13{
    public static void main(String[] args){
        float tempo = 0.0f; float velocidade = 0.0f; double litros_gastos = 0.0d; 
        double distancia = 0.0d; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade média percorrida:");
        velocidade = scanner.nextFloat();  
        System.out.println("Agora digite o tempo que o percurso levou:");
        tempo = scanner.nextFloat();
        
        distancia = velocidade * tempo;
        
        litros_gastos = distancia/12;
        System.out.println("Os litros gastos na viagem foram: " + litros_gastos + " litros");
       
    }
}