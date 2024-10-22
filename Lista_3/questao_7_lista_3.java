import java.util.Scanner;

public class questao_7_lista_3
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
			  if(coluna > linha){
				soma = soma + matriz[linha][coluna];
			  }
			}
		}
		System.out.println("a matriz é:");
		for(int linha = 0; linha<3; linha++){
			for(int coluna = 0; coluna < 3; coluna++){
				  System.out.printf(" %d ", matriz[linha][coluna]);
			}
				System.out.println("");
		}
		System.out.println("A soma acima da diagonal principal é: " + soma);
		scanner.close();
	}
}