import java.util.Scanner;

public class Main
{
    public static int soma(int a, int b){
        return a+b;
    }
    public static int subtracao(int a, int b){
        return a-b;
    }
    public static int divisao(int a, int b){
        return a/b;
    }
    public static int multiplicacao(int a, int b){
        return a*b;
    }
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num1 = 0; int num2 = 0; String operacao = ""; int resultado = 0;
	   System.out.println("Digite o cálculo a ser feito:");
		num1 = scanner.nextInt(); operacao = scanner.next(); num2 = scanner.nextInt(); 
		switch(operacao){
		  case "+":
	           resultado = soma(num1, num2);
	           System.out.println("O resultado da soma é: " + resultado);
	           break;
	       case "-":
	           resultado = subtracao(num1, num2);
	           System.out.println("O resultado da subtração é: " + resultado);
	           break;
	       case "*":
	           resultado = multiplicacao(num1, num2);
	           System.out.println("O resultado da multiplicação é: " + resultado);
	           break;
	       case "/":
	           resultado = divisao(num1, num2);
	           System.out.println("O resultado da divisão é: " + resultado);
	           break;}
	}
}