import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int soma = 0;
	    int [][] matriz = new int[3][3];
	    System.out.println("Matriz M[3][3]\n");
		for(int linha = 0; linha<3; linha++){
		    for(int coluna = 0; coluna < 3; coluna++){
		        System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
		        matriz[linha][coluna] = scanner.nextInt();
		    }
		}
		for(int linha = 0; linha<3; linha++){
		    for(int coluna = 0; coluna < 3; coluna++){
		      //  System.out.printf("\t %d \t", matriz[linha][coluna]);
		      soma = soma + matriz[linha][coluna];
		    }
		}
		System.out.println("A soma dos elementos da matriz é: " + soma);
		scanner.close();
	}
}