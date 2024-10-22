import java.util.Scanner;

public class questao_4_lista_3
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [][] matriz_1 = new int[2][3];
		int [][] matriz_2 = new int[3][2];
		int [][] matriz_final = new int[2][2];
		System.out.println("Matriz M[2][3]\n");
		for(int linha = 0; linha<2; linha++){
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz_1[linha][coluna] = scanner.nextInt();
			}
		}
		System.out.println("Matriz M[3][2]\n");
		for(int linha = 0; linha<3; linha++){
			for(int coluna = 0; coluna < 2; coluna++){
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz_2[linha][coluna] = scanner.nextInt();
			}
		}
		for(int linha = 0; linha<2; linha++){
			for(int coluna = 0; coluna < 2; coluna++){
				if(linha == 0 && coluna == 0){
					//aux = (matriz_1[0][0]*matriz_2[0][0]) + (matriz_1[0][1]*matriz_2[1][0]) + (matriz_1[0][2]*matriz_2[2][0]);
					matriz_final[linha][coluna] = (matriz_1[0][0]*matriz_2[0][0]) + (matriz_1[0][1]*matriz_2[1][0]) + (matriz_1[0][2]*matriz_2[2][0]);
				}
				else if(linha == 0 && coluna == 1){
					matriz_final[linha][coluna] = (matriz_1[0][0]*matriz_2[0][1]) + (matriz_1[0][1]*matriz_2[1][1]) + (matriz_1[0][2]*matriz_2[2][1]);
				}
				else if(linha == 1 && coluna == 0){
					matriz_final[linha][coluna] = (matriz_1[1][0]*matriz_2[0][0]) + (matriz_1[1][1]*matriz_2[1][0]) + (matriz_1[1][2]*matriz_2[2][0]);
				}
				else if(linha == 1 && coluna == 1){
					matriz_final[linha][coluna] = (matriz_1[1][0]*matriz_2[0][1]) + (matriz_1[1][1]*matriz_2[1][1]) + (matriz_1[1][2]*matriz_2[2][1]);
				}
			}
		}
		System.out.println("a matriz é:");
		for(int linha = 0; linha<2; linha++){
			for(int coluna = 0; coluna < 2; coluna++){
				  System.out.printf(" %d ", matriz_final[linha][coluna]);
			}
				System.out.println("");
		}
		scanner.close();
	}
}