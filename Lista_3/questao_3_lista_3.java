import java.util.Scanner;


public class questao_3_lista_3
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maior = 0;
		int col = 0;
		int lin = 0;
		int [][] matriz = new int[5][5];
		System.out.println("Matriz M[5][5]\n");
		for(int linha = 0; linha<5; linha++){
			for(int coluna = 0; coluna < 5; coluna++){
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna] = scanner.nextInt();
			}
		}
		for(int linha = 0; linha<5; linha++){
			for(int coluna = 0; coluna < 5; coluna++){
			  //  System.out.printf("\t %d \t", matriz[linha][coluna]);
			  if(matriz[linha][coluna] > maior){
				maior = matriz[linha][coluna];
				lin = linha; col = coluna;
			  }
			 
			}
		}
		System.out.println("a matriz é:");
		for(int linha = 0; linha<5; linha++){
			for(int coluna = 0; coluna < 5; coluna++){
				  System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
				System.out.println("");
		}
		System.out.println("O maior elemento da matriz é: " + maior);
		System.out.printf("Na posição M[%d][%d]: ", lin+1, col+1);
		scanner.close();
	}
}