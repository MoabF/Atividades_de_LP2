import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float peso = 0.0f; float altura = 0.0f; double IMC = 0.0d;
		System.out.println("Digite seu peso:");
		peso = scanner.nextFloat();
		System.out.println("Digite sua altura:");
		altura = scanner.nextFloat();
		IMC = peso / (altura * altura);
		if(IMC < 18.5){
    		System.out.println("Seu IMC é: " + IMC + ", Você está com Baixo peso");
		}
		else if(IMC >= 18.6 && IMC <= 24.9){
    		System.out.println("Seu IMC é: " + IMC + ", Você está com o Peso normal");
		}
		else if(IMC >= 25 && IMC <= 29.9){
    		System.out.println("Seu IMC é: " + IMC + ", Você está com Sobrepeso");
		}
		else if(IMC >= 30 && IMC <= 34.9){
    		System.out.println("Seu IMC é: " + IMC + ", Você está com Obesidade grau I");
		}
		else if(IMC >= 35 && IMC <= 39.9){
    		System.out.println("Seu IMC é: " + IMC + ", Você está com Obesidade grau II");
		}
		else{
    		System.out.println("Seu IMC é: " + IMC + ", Você está com Obesidade grau III");
		}
	}
}