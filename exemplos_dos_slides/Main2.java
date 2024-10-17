import java.util.Scanner;
public class Main2
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1 = 0.0f; float num2 = 0.0f; String operacao = ""; double resultado = 0.0d;
		System.out.println("Digite o cálculo a ser feito:");
		num1 = scanner.nextFloat(); operacao = scanner.next(); num2 = scanner.nextFloat(); 
	
	    switch(operacao){
	       case "+":
	           resultado = num1 + num2;
	           System.out.println("O resultado da soma é: " + resultado);
	           break;
	       case "-":
	           resultado = num1 - num2;
	           System.out.println("O resultado da subtração é: " + resultado);
	           break;
	       case "*":
	           resultado = num1 * num2;
	           System.out.println("O resultado da multiplicação é: " + resultado);
	           break;
	       case "/":
	           resultado = num1 / num2;
	           System.out.println("O resultado da divisão é: " + resultado);
	           break;
	       case "^":
	           resultado = 1;
	           while(num2 > 0){
	               resultado = resultado * num1;
	               num2--;
	           }
	           System.out.println("O resultado da exponenciação é: " + resultado);
	           break;
	    }
		scanner.close();
	}
}