import java.util.Scanner;

public class questao_10_lista_3
{
	public static void print_matriz(int a, int b){
		char[][] matriz = new char[8][8];
		System.out.println("\nMovimentos possíveis");
		for(int linha = 0; linha<8; linha++){
			for(int coluna = 0; coluna < 8; coluna++){
				if(linha == a-1 || coluna == b-1){
					matriz[linha][coluna] = 'X';
				}
				else{
					matriz[linha][coluna] = '-';
				}
			}
		}
		for(int linha = 0; linha<8; linha++){
			for(int coluna = 0; coluna < 8; coluna++){
				System.out.printf(" %c ", matriz[linha][coluna]);
			}
				System.out.println("");
			}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0; int b = 0;
		System.out.print("Digite a linha em que a torre se encontra: ");
		a = scanner.nextInt();
		System.out.print("Digite a coluna em que a torre se encontra: ");
		b = scanner.nextInt();		
		print_matriz(a, b);
		scanner.close();
	}
}